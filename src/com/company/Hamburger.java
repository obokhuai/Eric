package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double menu(){
        double totalPrice = this.price;
        if (addition1Name !=null){
            totalPrice +=addition1Price;
            System.out.println("Added" + addition1Name + " for " + addition1Price);
        }
        if (addition2Name !=null){
            totalPrice +=addition2Price;
            System.out.println("Added" + addition2Name + " for " + addition2Price);
        }
        if (addition3Name !=null){
            totalPrice +=addition3Price;
            System.out.println("Added" + addition3Name + " for " + addition3Price);
        }
        if (addition4Name !=null){
            totalPrice +=addition4Price;
            System.out.println("Added" + addition4Name + " for " + addition4Price);
        }
        return totalPrice;
    }

}
