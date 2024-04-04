package week04.collections.set.linkedhashsetexample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample01 {
    public static void main(String[] args) {
        Set<Integer> evenNumbers = new LinkedHashSet<>();
        evenNumbers.add(8);
        evenNumbers.add(6);
        evenNumbers.add(4);
        System.out.println(evenNumbers);

        Set<Integer> oddNumbers =   new LinkedHashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        oddNumbers.add(8);
        oddNumbers.add(6);

        evenNumbers.addAll(oddNumbers);
        System.out.println(evenNumbers);


    }
}
