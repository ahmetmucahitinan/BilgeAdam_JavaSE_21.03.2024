package week03.constructor;

public class Main {
   private String name ;

   Main(){
       System.out.println("Constructor Called...");
       name= "ahmet mücahit";

   }
    public static void main(String[] args) {
       NoArgsConstructor noArgsConstructor = new NoArgsConstructor();
       Main obj = new Main();
       Main obj2 = new Main();
       System.out.println("The name is : " + obj.name+" \n The second name is : " + obj2.name);

   }
}
