package week04.interfaceexamples.example01;

public class Rectangle implements Polygon {

    @Override
    public void getArea(int length, int width) {
        System.out.println("The area of the rectangle is " + (length*width));
    }
}
