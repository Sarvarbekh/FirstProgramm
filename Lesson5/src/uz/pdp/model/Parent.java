package uz.pdp.model;

public  class Parent {

    private void privateMethod(){
        System.out.println("Private method ishga tushdi");
    }
    void defaultMethod(){
        System.out.println("Default method ishga tushdi");
    }
    protected void protectedMethod(){
        System.out.println("Protected method ishg tushdi");
    }
    public void publicMethod(){
        System.out.println("Public method ishga tushdi");
    }

    public static void publicstaticMethod(){
        System.out.println("Public static method ishga tushdi");
    }

    public final void finalMethod(){
        System.out.println("Final method ishga tushdi");
    }

    public final int a = 5;
}
