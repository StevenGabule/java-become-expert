package fundamental.OOP.UserManagement_SOLID.services;

import fundamental.OOP.UserManagement_SOLID.interfaces.UserRepository;
import fundamental.OOP.UserManagement_SOLID.models.User;

import java.util.List;
import java.util.Optional;

public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public Optional<User> getUserById(Long id) {
    return userRepository.findById(id);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User updateUser(User user) {
    if (userRepository.findById(user.getId()).isEmpty()) {
      throw new IllegalArgumentException("User not found with id: " + user.getId());
    }
    return userRepository.update(user);
  }

  public void deleteUser(Long id) {
    userRepository.delete(id);
  }
}
