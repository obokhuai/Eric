package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic", "Sausage", "Sausage", 3.56 );
    hamburger.addHamburgerAddition1("Tomato", 0.27);
    hamburger.addHamburgerAddition2("Lettuce", 0.75);
    hamburger.addHamburgerAddition3("Cheese",1.13);

        System.out.println("Total price is " + hamburger.menu());
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(" Total delux burger price is " + deluxeBurger.menu());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon ", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        System.out.println("Total Healthy Burger price is " + healthyBurger.menu());
    }
}
