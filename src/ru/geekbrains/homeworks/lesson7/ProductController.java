package ru.geekbrains.homeworks.lesson7;

//контроллер
public class ProductController {

    private Product model;
    private ProductView view;

    public  ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public Product getModel() {
        return model;
    }

    public void setModel(Product model) {
        this.model = model;
    }

    public ProductView getView() {
        return view;
    }

    public void setView(ProductView view) {
        this.view = view;
    }

    public void updateView() {
        view.printProductInfo(model.getProductName(), model.getPrice());
    }
}
