package mvc_hibernate.dao;



import mvc_hibernate.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    void add(User user);

    User getUser(Long id);

    void deleteUser(Long id);

    void updateUser(User user);
}
