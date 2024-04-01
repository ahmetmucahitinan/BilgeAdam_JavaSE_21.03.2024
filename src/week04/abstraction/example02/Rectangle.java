package week04.abstraction.example02;

public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return width*height;
    }
//   1. Yöntem el ile yazmaktır
//    @Override
//    public double calculateArea(){
//        return 0.0;
//    }


//    2. yöntem ise kısayol kullanmak
//    @Override
//    public double calculateArea() {
//        return 0;
//    } // alt + insert -> implement methods yoluyla oluştururuz
}
