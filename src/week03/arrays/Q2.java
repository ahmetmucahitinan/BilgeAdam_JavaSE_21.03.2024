package week03.arrays;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*Kullanıcıdan 0 girene kadar hep sayılar alan ve 0 girildiğinde o zamana kadar girilen
        sayıların toplamını ekrana yazdıran java kodu */

        int sayi;
        int toplam = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi = scanner.nextInt();

            if (sayi == 0) {
                System.out.println("0 girildi. Toplam hesaplanacak" );
                break;
            }
            toplam +=sayi;
        }
        System.out.println("Girilen Sayıların Toplam değeri: " + toplam);
    }
}
