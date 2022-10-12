package uz.pdp.model;

public final class Child extends Parent{
    @Override
    void defaultMethod() {
        super.defaultMethod();
        System.out.println("Override qilingan default method");
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
        System.out.println(" Override qilingan protected method");
    }

    @Override
    public void publicMethod() {
        super.publicMethod();
        System.out.println("Override qilingan public method ");
    }


}
