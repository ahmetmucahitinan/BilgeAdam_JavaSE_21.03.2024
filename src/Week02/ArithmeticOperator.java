package Week02;

public class ArithmeticOperator {
    public static void main(String[] args) {

        // Değişken  Tanımlaması
        int number1 = 25, number2 = 3,  number3 = 17;
        String websiteName = "Web Sitemiz: ", websiteUri="www.bilgeadam.com";

        //Stringlerde ekleme operatörü kullanırsak;
        System.out.println("Merhaba!\n"+(websiteName + websiteUri) + "Sitemizi Ziyaret Edin"); // \n alt satır komutudur.

        // Ekleme ve çıkarma operatörleri:
        System.out.println("A + B = "+(number1 + number2));
        System.out.println("A - C = "+ (number1 - number3));

        // Çarpma ve bölme operatörleri
        System.out.println("A * B = "+(number1 * number2));
        System.out.println("A / 5 = "+(number1 / 5) );

        //Mod Alma operatörleri
        System.out.println("C % B = "+(number3 % number2));
    }
}
