package uz.pdp;

public class GitExample extends GitProgram{
    private String name;
    private int age;
    
   public GitExample(){
   }
    
    public GitExample(String name, int age){
        this.age = age;
        this.name = name;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello Islom pepka");
    }
}
