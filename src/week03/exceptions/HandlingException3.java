package week03.exceptions;

public class HandlingException3 {
    public static void main(String[] args) {

        String name = null;

        if (name == null){ //name.equals olarak sormak istesekte soramazdık. Çünkü equalsın name'in referans değeri var ise ancak çalışır.
            System.out.println("Lütfen bir isim giriniz!");
        }else {
            System.out.println(name.toUpperCase());
        }
    }
}
