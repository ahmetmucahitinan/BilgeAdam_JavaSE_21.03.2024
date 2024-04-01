package week03.oop.principles.inheritance.ornek02;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("Red");
        shape.draw();
        System.out.println(shape.color);

        Circle circle = new Circle("Orange",10);
        circle.draw();
        System.out.println("Çemberin Rengi : "+circle.color + "\nÇemberin Alanı : "+circle.calculateArea());

        Rectangle rectangle = new Rectangle("Green",10,5);
        rectangle.draw();
        System.out.println("Dikdörtgenin Rengi : "+circle.color + "\nDikdörtgenin Alanı : "+rectangle.calculateArea());

        Triangle triangle = new Triangle("Blue",3.72,7.53);
        triangle.draw();
        System.out.println("Üçgenin Rengi : "+circle.color + "\nÜçgenin Alanı : "+triangle.calculateArea());

    }
}
