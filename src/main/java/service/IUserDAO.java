package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> selectAllUsersSort();

    public List<User> selectUsersByContry(String contry);

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
}
