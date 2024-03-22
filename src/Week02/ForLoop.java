package Week02;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanner.nextInt(), scanner.nextLong(), scanner.nextDouble(),
        // scanner.nextFloat(), scanner.nextLine()
        int sayi, sayac = 0;
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = scanner.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println("Çift Olan Sayı: " + i );
                sayac++;
            }
        }
        System.out.println(sayi + " Değerine Kadar Olan Toplam Çift sayısı: " + sayac);
    }
}
