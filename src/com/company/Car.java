package com.company;


public class Car {

    private String model;
    private int year;
    private String color;

    public Enum getBrand() {
        return Brand;
    }

    public void setBrand(Enum brand) {
        Brand = brand;
    }

    private Enum Brand;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
