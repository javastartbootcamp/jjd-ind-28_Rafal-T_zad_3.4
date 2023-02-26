package pl.javastart.task.components;

import java.time.LocalDate;

public class SpecialOffer {
    Product product;
    String description;
    LocalDate startDate;
    LocalDate endDate;
    short discount;

    public SpecialOffer(Product product, String description, LocalDate startDate, LocalDate endDate, short discount) {
        this.product = product;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
    }
}
