package fundamental.OOP.UserManagement_SOLID.repositories;

import fundamental.OOP.UserManagement_SOLID.interfaces.UserRepository;
import fundamental.OOP.UserManagement_SOLID.models.User;

import java.util.*;

public class InMemoryUserRepository implements UserRepository {
  private final Map<Long, User> users = new HashMap<>();
  private Long currentId = 1L;

  @Override
  public User save(User user) {
    if (user.getId() == null) {
      user.setId(currentId++);
    }
    users.put(user.getId(), user);
    return user;
  }

  @Override
  public Optional<User> findById(Long id) {
    return Optional.ofNullable(users.get(id));
  }

  @Override
  public List<User> findAll() {
    return new ArrayList<>(users.values());
  }

  @Override
  public User update(User user) {
    if (!users.containsKey(user.getId())) {
      throw new NoSuchElementException("User not found with id: " + user.getId());
    }
    users.put(user.getId(), user);
    return user;
  }

  @Override
  public void delete(Long id) {
    users.remove(id);
  }
}
