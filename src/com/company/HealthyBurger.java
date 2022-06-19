package com.company;

public class HealthyBurger extends Hamburger{

    private String healthyExtraName1;
    private double healthyExtraPrice1;

    private String healthyExtraName2;
    private double healthyExtraPrice2;

    public HealthyBurger(String meat,double price) {
        super("Healthy Burger", meat, "Brown", price);
    }

    public void addHealthyAddition1(String name , double price){
        this.healthyExtraName1= name;
        this.healthyExtraPrice1 = price;
    }

    public void addHealthyAddition2(String name , double price){
        this.healthyExtraName2= name;
        this.healthyExtraPrice2= price;
    }

    @Override
    public double menu() {
        double totalPrice1 = super.menu();

        if (healthyExtraName1 !=null){
            totalPrice1 += this.healthyExtraPrice1;
            System.out.println("added " + healthyExtraName1 + " for " + healthyExtraPrice1);
        }

        if (healthyExtraName2 !=null){
            totalPrice1 += this.healthyExtraPrice2;
            System.out.println("added " + healthyExtraName2 + " for " + healthyExtraPrice2);
        }
        return totalPrice1;
    }
}
