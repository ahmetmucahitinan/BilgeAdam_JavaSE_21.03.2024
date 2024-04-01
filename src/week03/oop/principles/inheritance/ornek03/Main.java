package week03.oop.principles.inheritance.ornek03;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Vehicle vehicle = new Vehicle("Volvo","FH-540", 2024);
        vehicle.start();
        System.out.println("Aracın Özellikleri : "
                + "\n Markası : " + vehicle.brand + ", "
                + "\n Modeli : " + vehicle.model + ", "
                + "\n Yılı : "+ vehicle.year );
        vehicle.stop();

        System.out.println();
        Car car = new Car(2);
        car.start();
        System.out.println("Aracın Özellikleri : "
                + "\n Markası : " + vehicle.brand + ", "
                + "\n Modeli : " + vehicle.model + ", "
                + "\n Yılı : "+ vehicle.year );
        System.out.println("Aracın Kapı Sayısı : "+car.numDoors);
        car.stop();

        System.out.println();
        Motorcycle motorcycle = new Motorcycle(false);
        motorcycle.start();
        System.out.println("Aracın Özellikleri : "
                + "\n Markası : " + vehicle.brand + ", "
                + "\n Modeli : " + vehicle.model + ", "
                + "\n Yılı : "+ vehicle.year );
        System.out.println("Aracın Kapı Sayısı : "+car.numDoors);
        System.out.println("Motosiklet Yan Römorka Sahip Mi? : "+motorcycle.hasSidecar);
        motorcycle.stop();

        System.out.println();
        Truck truck = new Truck(150000.05);
        truck.start();
        System.out.println("Aracın Özellikleri : "
                + "\n Markası : " + vehicle.brand + ", "
                + "\n Modeli : " + vehicle.model + ", "
                + "\n Yılı : "+ vehicle.year );
        System.out.println("Aracın Kapı Sayısı : "+car.numDoors);
        System.out.println("Motosiklet Yan Römorka Sahip Mi? : "+motorcycle.hasSidecar);
        System.out.println("Kamyonun Yük Kapasitesi : " + truck.cargoCapacity);
        truck.stop();


    }
}
