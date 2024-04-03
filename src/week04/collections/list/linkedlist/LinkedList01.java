package week04.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {

        // FIFD felsefesiyle çalışır. (First in first out) -> ilk gelen ilk çıkar.
        Queue<String> languageQueue = new LinkedList<>();

        // Elemanlar ekleyelim
        languageQueue.add("Python");
        languageQueue.add("Java");
        languageQueue.add("C#");
        System.out.println("LinkedList : " + languageQueue);

        String str1 = languageQueue.peek(); //peek ilk görebildiği sıranın başında kim varsa ona bakmaya yarar. Yani en baştaki elemanı görüntüler.
        System.out.println("Accessed Element : " + str1);

//      // En baştaki elamana erişelim, aynı zamanda da listeden çıkaralım.
        String str2 = languageQueue.poll();
        System.out.println("Removed Element : " + str2);
        System.out.println("LinkedList after poll() : " + languageQueue);

        // Listenin sonuna eleman ekleyelim
        languageQueue.offer("Swift");
        System.out.println("LinkedList after offer() : " + languageQueue);
    }
}