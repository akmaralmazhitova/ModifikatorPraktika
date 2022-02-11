package com.company.product;

import java.util.Objects;
import java.util.Scanner;

public class Product {
    private String type;
    private String model;
    private int quantity;
    private int price;
    private int discount;
    private int amount;

    public Product(String type, String model, int quantity) {
        this.type = type;
        this.model = model;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        String password = "akmaral";
        if (password.equals(scanner.nextLine())){
        System.out.println("enter price");
        price = scanner.nextInt();
        System.out.println("enter discount");
        discount = scanner.nextInt();
        int i= 100 - discount;
        amount = (i * price)/100;
        System.out.println("Akirki baasi "+ amount);}
        else {
            System.out.println("Error");
        }

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", discount=" + discount +
                ", amount=" + amount +
                '}';
    }
}
