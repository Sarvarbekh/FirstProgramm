package uz.pdp.model;

import uz.pdp.service.Live;

public class Cat extends Animal implements Live {

    private String location;
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
