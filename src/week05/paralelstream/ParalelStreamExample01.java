package week05.paralelstream;

import java.util.Arrays;
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
    }
}
