package week04.abstraction.example01;

public abstract class Language {

    // abstract method gövdesi olmaz
    abstract void method1();

    //Standart method gövdesi olur.
    void method2(){
        System.out.println("This is a regular method");
    }
}
