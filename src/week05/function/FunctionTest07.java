package week05.function;

import java.util.function.Function;

public class FunctionTest07 {

    public static void main(String[] args) {

        // Metin Dizgisini alıp uzunluğunu hesaplayan bir function
        Function<String,Integer> textLength = String::length;
//        System.out.println(textLength.apply("Merhaba Java Kursu"));

        // Uzunluğu alınan metin dizgisini alıp, uzunluğun karesini hesaplayan bir function.
        Function<Integer, Integer> squareOfLength = n -> n*n; // n*n yerine -> (int) Math.pow(n,2)  bu yazılabilir

        // Bu iki function'ı birleştirip bir arada uygulayan function
        Function<String,Integer> combinedFunction = textLength.andThen(squareOfLength);
        System.out.println(combinedFunction.apply("Merhaba Java Kursu"));
    }
}
