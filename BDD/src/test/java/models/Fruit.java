package models;

public class Fruit {
    private String name, type;
    private double price;

    public Fruit(String name, String type, double price) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
