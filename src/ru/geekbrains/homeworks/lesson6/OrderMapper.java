package ru.geekbrains.homeworks.lesson6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderMapper {

    private final Connection connection;

    public OrderMapper(Connection connection) {
        this.connection = connection;
    }

    public Order findById(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT id, productList, totalPrice FROM Order");
        statement.setInt(1, id);
        try (ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()) {
                Order order = new Order(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3));
                return order;
            }
        }
    }
}
