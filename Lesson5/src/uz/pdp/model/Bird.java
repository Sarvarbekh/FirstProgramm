package uz.pdp.model;

import uz.pdp.service.Live;
import uz.pdp.service.flyInterface;

public class Bird extends Animal implements Live, flyInterface {
// 1) Bird extend from animal
// 2) Implement from fly and live
    private String type;
    private String color;
    private double weight;

    @Override //Override from Animal
    public void voice() {
        System.out.println("Qush ovozi");
    }

    @Override // implement from live
    public void eat() {

    }

    @Override// implement from live
    public void sleep() {

    }

    @Override// implement from live
    public void walk() {

    }

    @Override// implement from fly
    public void fly() {

    }

    @Override// implement from fly
    public void landing() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
