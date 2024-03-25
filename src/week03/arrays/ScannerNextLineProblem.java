package week03.arrays;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz : ");
        int age = scanner.nextInt(); //scanner.nextInt()+ "\n";
        scanner.nextLine();

        System.out.println("Lütfen adınızı giriniz: ");
        String name = scanner.nextLine();

        System.out.println(age + " " +name);


        System.out.println("Lütfen adınızı giriniz: ");
        int name2 = Integer.parseInt(scanner.nextLine()); //scanner.nextInt()+ "\n";
        System.out.println(name2);
    }
}
