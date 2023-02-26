package pl.javastart.task;

import pl.javastart.task.components.Category;
import pl.javastart.task.components.Product;
import pl.javastart.task.components.SpecialOffer;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Category notebooks = new Category("Laptopy", "Sprzęt przenośny do pracy oraz grania");
        Category phones = new Category("Telefony", "Komórki z systemami adnroid, iOS oraz huwaeiOS");

        Product asusZenbook = new Product("ASUS ZenBook 14 Flip R5-5600H", 4699.00, "ASUS ZenBook 14 Flip to biznesowy laptop, z którym..", notebooks);
        Product gigabyteG5 = new Product("Gigabyte G5 GE i5-12500H", 3899.50, "Poznaj gamingowy laptop Gigabyte G5 GE, który nie boi się wyzwań...", notebooks);

        Product xiaomi12T = new Product("Xiaomi 12T", 5500.55, "Xiaomi lepsze...", phones);

        Product walkingPad = new Product("KingSmith Walking R1 Pro", 2399.00, "Składana bieżnia do domowego użytku", null);

        SpecialOffer springOffer = new SpecialOffer(xiaomi12T, "Wiosenna wyprzedaż", LocalDate.of(2023, 4, 1), LocalDate.of(2023, 5, 31), (short) 20);

        System.out.println(asusZenbook);
        System.out.println(gigabyteG5);
        System.out.println(xiaomi12T);
        System.out.println(walkingPad);
    }
}
