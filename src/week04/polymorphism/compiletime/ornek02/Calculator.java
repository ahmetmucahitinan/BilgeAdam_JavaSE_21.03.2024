package week04.polymorphism.compiletime.ornek02;

public class Calculator {

    int sum(int x, int y){
        return x+y;
    }
    int sum(int x, int y, int z){
        return x+y+z;
    }
    int sum(int x, int y, int z, int t){
        return x+y+z+t;
    }
    double sum(double x,double y){
        return x+y;
    }
    double sum(double x,double y,double z){
        return x+y+z;
    }
    double sum(double x,double y, double z, double t){
        return x+y+z+t;
    }
}
