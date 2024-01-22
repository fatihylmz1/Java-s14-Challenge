package com.workintech.burger;

public class Hamburger implements Addable{
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;

    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, BreadRollType breadRollType, double price) {
        this.name = name;
        this.meat = "Beef";
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public void addAddition(String additionName, double price) {
        if (addition1 == null) {
            this.addition1 = new Addition(additionName, price);
        } else if (addition2 == null) {
            this.addition2 = new Addition(additionName, price);
        } else if (addition3 == null) {
            this.addition3 = new Addition(additionName, price);
        } else if (addition4 == null) {
            this.addition4 = new Addition(additionName, price);
        } else {
            System.out.println("You cannot add more material");
        }
    }
    public String itemize() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("Bread Roll Type: " + breadRollType + "\n");

        if (addition1 != null) {
            builder.append("Addition1: " + addition1.getAdditionName() + "\n");
            price = price + addition1.getAdditionPrice();
        }
        if (addition2 != null) {
            builder.append("Addition2: " + addition2.getAdditionName() + "\n");
            price = price + addition2.getAdditionPrice();
        }
        if (addition3 != null) {
            builder.append("Addition3: " + addition3.getAdditionName() + "\n");
            price = price + addition3.getAdditionPrice();
        }
        if (addition4 != null) {
            builder.append("Addition4: " + addition4.getAdditionName() + "\n");
            price = price + addition4.getAdditionPrice();
        }

        return builder.toString();
    }

    public double itemizeHamburger() {
        String description = itemize();
        System.out.println(description);
        System.out.println("Price: " + getPrice());
        System.out.println("--------------------");
        return getPrice();
    }
}
