package com.example.btth2.models;

public class Product {
    private int id;
    private String name;
    private String code;
    private String brand;
    private String model;
    private String description;
    private String images;
    private String color;
    private double price;

    public Product(int id, String name, String code, String brand, String model, String description, String images, String color, double price) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.images = images;
        this.color = color;
        this.price = price;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public String getImages() {
        return images;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}