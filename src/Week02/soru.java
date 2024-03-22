package Week02;
import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam=0;
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = scanner.nextInt();

        for (int i=1; i<=sayi; i++){
            toplam = toplam + (i+1);
        }
        System.out.println("1'den Sayıya kadar olan sayıların 1 fazlasının toplamı: "+toplam);
    }
}
