package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> showAllUsers();
    User getUserById(int id);
    void delete(int id);
    void update(int id, User user);
    void save(User user);

}
