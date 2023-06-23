package com.example.productlist3.model;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private double qty;
    public Product(){

    }
    public Product(int id, String name, String description, double price, double qty) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product[id=" + id + ",name=" + name +",description=" + description + "price=" +price + "qty=" + qty + "]";
    }
}



