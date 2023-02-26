package pl.javastart.task.components;

public class Category {

    String name;
    String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }
}
