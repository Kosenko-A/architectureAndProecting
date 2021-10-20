package ru.geekbrains.homeworks.lesson6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {
    private final Connection connection;

    public UserMapper(Connection connection) {
        this.connection = connection;
    }

    public User findById(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT id, login, password FROM User");
        statement.setInt(1, id);
        try (ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()) {
                User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
                return user;
            }
        }
    }
}
