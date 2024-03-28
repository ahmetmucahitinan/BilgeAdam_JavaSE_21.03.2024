package week03.garbagecollector;

public class GarbageCollectionTest1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Eşşek";

        Animal animal2 = new Animal("Eşşekoğlu");

        System.out.println(animal.name + " "+animal2.name);
        animal=null; /*bu aşamada Garbage Collector tam burada devreye girer. ve heap alanından
        animal öğesini temizler */
        animal2 = null;

    }
}
