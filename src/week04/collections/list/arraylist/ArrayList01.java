package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //ArrayList Sınıfını kullanarak bir list ürettik
        List<Integer> numberList = new ArrayList<>();
        //Listemize elemanlar ekledik.
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        System.out.println("List : " + numberList);
        // Listeden bir indexe erişim
        int number = numberList.get(2); // auto unboxing. Çünkü valueOf diyip çıkarmıyoruz
        System.out.println("Accesed element" + number);

        //  Listeden bir indexin kaldırılması
        int removedNumber = numberList.remove(1);
        System.out.println("Removed Element : " + removedNumber);
        System.out.println("List : " + numberList);
    }
}
