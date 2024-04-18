package week05.paralelstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParalelStreamExample01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream();
        Stream<Integer> paralelStream = stream.parallel();
        System.out.println(paralelStream.count());

        Stream<Integer> paralelStream2 = Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream();
        System.out.println(paralelStream2.count());

        Arrays.asList("jackal", "racoon", "wolf", "kangaroo").parallelStream().map( s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println);


        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i<50000;i++){
            myList.add(i);
        }
        long startTime = 0;
        long timeElapsed = 0;
        startTime = System.nanoTime();
        List<Integer> parallelStreamList =  myList.parallelStream().map(s -> {
            s = s*2;
            s+=1;
            return s;
        }).collect(Collectors.toList());
        timeElapsed = System.nanoTime()-startTime;
        System.out.println("Elapsed time for parallelStreamList : " +timeElapsed);
//         startTime = System.nanoTime();
//        List<Integer> streamList =  myList.stream().map(s -> {
//            s = s*2;
//            s+=1;
//            return s;
//        }).collect(Collectors.toList());
//        timeElapsed = System.nanoTime()-startTime;
//        System.out.println("Elapsed time for streamList : " +timeElapsed);
        System.out.println(Long.MAX_VALUE);
    }
}
