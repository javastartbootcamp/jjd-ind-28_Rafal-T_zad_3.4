package pl.javastart.task.components;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    @Override
    public String toString() {
        return "W kategorii " + category + " posiadamy " + name + " w cenie " + price +
                ". \nOpis: '" + description + '\'';
    }

}
