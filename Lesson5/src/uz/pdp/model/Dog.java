package uz.pdp.model;

import uz.pdp.service.Live;

public class Dog extends Animal implements Live {
    @Override
    public void voice() {
        System.out.println("Woof");
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
}
