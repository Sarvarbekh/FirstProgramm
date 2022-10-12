package uz.pdp.model;

import uz.pdp.service.Technic;
import uz.pdp.service.flyInterface;

public class Plane implements flyInterface, Technic {
    private String model;
    private String color;
    private int capacity;//odam sigimi
    private int number_of_engine;//motorlar soni

    @Override
    public void fly() {

    }

    @Override
    public void landing() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void repair() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumber_of_engine() {
        return number_of_engine;
    }

    public void setNumber_of_engine(int number_of_engine) {
        this.number_of_engine = number_of_engine;
    }
}
