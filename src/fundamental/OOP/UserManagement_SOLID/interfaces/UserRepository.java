package fundamental.OOP.UserManagement_SOLID.interfaces;

import fundamental.OOP.UserManagement_SOLID.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
  User save(User user);
  Optional<User> findById(Long id);
  List<User> findAll();
  User update(User user);
  void delete(Long id);
}
