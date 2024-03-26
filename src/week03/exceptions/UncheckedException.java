package week03.exceptions;

import java.util.Scanner;

public class UncheckedException {
    // -> Runtime hataları yani çalışma zamanında gerçekleşen hatalar.
    public static void main(String[] args) {
        String name = null;

        // Kötü kod yaklaşımı
        try {
            if (name.equals("ahmet mücahit")){
                System.out.println("name : ahmet mücahit");
            }
        }catch (NullPointerException e){
            System.out.println("Catch!");
        }
        // İdare eder, fena değil kod yapısı
        if (name != null && name.equals("ahmet mücahit")) { // kod yukarıdan aşağı - soldan sağa doğru teste girer
            System.out.println("name : ahmet mücahit");
        }
            // Çok iyi kod yaklaşımı
            if ("ahmet mücahit".equals(name)) {
                System.out.println("name : ahmet mücahit");
            }
            // null değerler sadece objelere verilebilir.
    }
}
