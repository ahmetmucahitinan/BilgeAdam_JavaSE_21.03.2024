package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("Java");
        firstList.add("Python");
        List<String> secondList = new ArrayList<>();
        secondList.add("Scala");
        secondList.add("Kotlin");
        List<String> thirdList = new ArrayList<>();
        thirdList.add("ReactJS");


        //Bir listeyi başka bir listeye ekleme
//        firstList.addAll(secondList);
//        System.out.println(firstList);

        secondList.addAll(firstList);
        thirdList.addAll(secondList);
        System.out.println(thirdList);

    }
}
