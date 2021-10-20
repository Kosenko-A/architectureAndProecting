package ru.geekbrains.homeworks.lesson7;

public class MVCPatternDemo {

    public static void main(String[] args) {
        Product model = getProductFromDB();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(model, view);

        controller.updateView();

    }

    private static Product getProductFromDB() {
        Product product = new Product();
        product.setProductName("Computer");
        product.setPrice(20000);
        return product;
    }
}
