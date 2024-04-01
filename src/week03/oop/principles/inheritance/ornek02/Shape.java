package week03.oop.principles.inheritance.ornek02;

public class Shape {
    String color;

    Shape(){

    }
    Shape(String color){
        this.color=color;
    }

    void draw(){
        System.out.println("Drawing a shape");

    }
    double  calculateArea(){
        return 0.0;
    }


}
