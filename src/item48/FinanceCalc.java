package item48;


import item36.Bigram;

import java.math.BigDecimal;

public class FinanceCalc {

    public static void candyDouble() {
        double founds = 1.;
        int itemsBought = 0;
        for(double price = 0.1; founds >= price; price += 0.1) {
            founds -= price;
            ++itemsBought;
        }
        System.out.println("candyDouble==================");
        System.out.println(itemsBought + " items bought");
        System.out.println(founds + "$ change");
    }

    public static void candyInt() {
        int founds = 100;
        int itemsBought = 0;
        for(int price = 10; founds >= price; price += 10) {
            founds -= price;
            ++itemsBought;
        }
        System.out.println("candyInt==================");
        System.out.println(itemsBought + " items bought");
        System.out.println(founds + " cents change");
    }

    public static void candyBigDecimal() {
        BigDecimal founds = new BigDecimal("1.00");
        int itemsBought = 0;
        BigDecimal diffPrice = new BigDecimal("0.1");
        for(BigDecimal price = diffPrice; founds.compareTo(price) >= 0; price = price.add(diffPrice)) {
            founds = founds.subtract(price);
            ++itemsBought;
        }
        System.out.println("candyBigDecimal==================");
        System.out.println(itemsBought + " items bought");
        System.out.println(founds + "$ change");
    }
}
