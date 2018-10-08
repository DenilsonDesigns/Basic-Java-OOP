package com.denilson;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", .27);
        hamburger.addHamburgerAddition2("Cheese", .75);
        hamburger.addHamburgerAddition3("Cheese", 1.5);
        System.out.println("Total burger price: "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);

        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg", 5.45);

        healthyBurger.addHealthAddition1("Lentils", 3.51);
        System.out.println("Total burger price: "+healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
    }
}
