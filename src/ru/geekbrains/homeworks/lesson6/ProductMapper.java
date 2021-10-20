package ru.geekbrains.homeworks.lesson6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper {

    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public Product findById(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT id, productName, price FROM Product");
        statement.setInt(1, id);
        try (ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getLong(3));
                return product;
            }
        }
    }
}
