package week03.oop;

public class Test {
    public static void main(String[] args) {
        ClassName className1 = new ClassName();
        System.out.println(className1.sayHello("Ahmet Mücahit"));
        System.out.println(className1.sum(1,5));

        ClassName className2 = new ClassName();
        System.out.println(className2.sayHello("Tuba"));
        System.out.println(className2.sum(8,12));


        Person p1 = new Person();
        p1.name = "Ahmet Mücahit";
        p1.gender = "Male";
        p1.nickname = "Marka";
        p1.sleep();
        p1.walk();

        Person p2 = new Person();
        p2.name = "Melisa";
        p2.nickname = "Beautiful";
        p2.sleep();
        p2.walk();
    }
}
