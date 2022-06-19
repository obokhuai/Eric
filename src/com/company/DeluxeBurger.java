package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe Burger", "Chicken", "brown", 17.10);
        super.addHamburgerAddition1(" Chips", 1.00);
        super.addHamburgerAddition2(" drinks", 1.00);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional item can be added to the Delux Burger ");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional item can be added to the Delux Burger ");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional item can be added to the Delux Burger ");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional item can be added to the Delux Burger ");
    }
}
