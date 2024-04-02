package week04.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<>();

        animalList.add("Kaplan");
        animalList.add("Çıngıraklı Yılan");
        animalList.add("Kuzu");
        animalList.add("Penguen");
        animalList.add("Kirpi");

        System.out.println("Hayvanların Listesi : " +animalList);

        String str = animalList.get(1);
        System.out.println("Element at index 1 is : " + str);
        int i = 0;
        System.out.println("Element at index 0 is : " + animalList.get(i));

    }
}
