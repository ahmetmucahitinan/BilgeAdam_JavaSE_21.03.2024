package week03.oop.principles.inheritance.ornek01;

import week03.oop.principles.inheritance.ornek01.Animal;

public class Dog extends Animal {
    public void Display(){
        System.out.println("My name is " +name);
    }
    @Override
    public void eat() { //Method Overriding
        super.eat(); //superclasstaki eat() metodu
//        this.eat(); // bu sınıftaki eat() metodu
        System.out.println("I eat dog food");
    }
}
