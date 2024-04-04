package week04.abstraction.example02;

public class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
//        return Math.PI*radius*radius;
        return Math.PI*Math.pow(radius,2);
    }
}