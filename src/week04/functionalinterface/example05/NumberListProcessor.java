package week04.functionalinterface.example05;

import java.util.List;

@FunctionalInterface
public interface NumberListProcessor {

    int process(List<Integer> numbers);
}
