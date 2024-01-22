package com.workintech.burger;

public class DeluxeBurger extends Hamburger{
    private String drink;
    private String cips;

    public DeluxeBurger() {
        super("Deluxe Burger", BreadRollType.DOUBLE_BURGER, 19.1);
        super.setMeat("Double");
    }

    @Override
    public void addAddition(String additionName, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }
    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
