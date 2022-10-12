package uz.pdp.model;

public abstract class Animal {
    private int age = 5;
    private static final int eye = 2;
    String color;

    public abstract void voice();

    public void about(){
        System.out.println("age = " + age);
    }
}
