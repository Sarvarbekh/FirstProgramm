package uz.pdp;

public class Example {
   private String name;
   private String email;
   private String adres;
   private String color;
   private int age;

    public Example() {
    }

    public Example(String name, String email, String adres, String color, int age) {
        this.name = name;
        this.email = email;
        this.adres = adres;
        this.color = color;
        this.age = age;
    }

   public String getColor(){
         return color;
      }
   
   public void setColor(String color){
        this.color = color;
   }
   
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public static void main(String[] args) {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
