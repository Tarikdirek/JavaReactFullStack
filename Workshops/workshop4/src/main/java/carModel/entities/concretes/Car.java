package carModel.entities.concretes;

import carModel.entities.abstracts.Entity;


public class Car implements Entity {

    private int id ;
    private String modelName;
    private int modelYear;
    private String color;
    private double unitPrice;

    public Car(int id, String modelName, int modelYear, String color, double unitPrice) {
        this.id = id;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
