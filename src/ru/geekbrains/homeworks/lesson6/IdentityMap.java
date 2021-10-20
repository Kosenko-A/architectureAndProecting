package ru.geekbrains.homeworks.lesson6;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {

    private static Map<Integer, Order> orderMap = new HashMap<>();
    private static Map<Integer, Product> productMap = new HashMap<>();
    private static Map<Integer, User> userMap = new HashMap<>();

    public static void addOrder(Order order) {
        orderMap.put(order.getId(), order);
    }

    public static Order getOrder(Integer id) {
        return orderMap.get(id);
    }

    public static void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public static Product getProduct(Integer id) {
        return productMap.get(id);
    }

    public static void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    public static User getUser(Integer id) {
        return userMap.get(id);
    }
}
