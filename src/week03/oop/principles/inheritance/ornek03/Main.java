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
        Car car = new Car("Ford","Mustang",1969,2);
        car.start();
        System.out.println("Aracın Özellikleri : "
                + "\n Markası : " + car.brand + ", "
                + "\n Modeli : " + car.model + ", "
                + "\n Yılı : "+ car.year + ", "
                + "\nAracın Kapı Sayısı : "+car.numDoors);
        car.stop();

        System.out.println();
        Motorcycle motorcycle = new Motorcycle("Yamaha","R6",2020, false);
        motorcycle.start();
        System.out.println("Aracın Özellikleri : "
                + "\n Markası : " + motorcycle.brand + ", "
                + "\n Modeli : " + motorcycle.model + ", "
                + "\n Yılı : "+ motorcycle.year + ", "
                + "\n Motosiklet Yan Römorka Sahip Mi? : "+motorcycle.hasSidecar);
        motorcycle.stop();

        System.out.println();
        Truck truck = new Truck("Volvo","FH-540", 2024,150000.05);
        truck.start();
        System.out.println("Aracın Özellikleri : "
                + "\n Markası : " + truck.brand + ", "
                + "\n Modeli : " + truck.model + ", "
                + "\n Yılı : "+ truck.year + ", "
                + "\n Kamyonun Yük Kapasitesi : " + truck.cargoCapacity);
        truck.stop();

    }
}
