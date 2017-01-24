package java8;

import generics.Generators;
import generics.fibonacci.IterableFibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Generators.fill(integerList, new IterableFibonacci(10), 10);
//        integerList.forEach(System.out::println);
        System.out.println(integerList.stream().mapToInt(i -> 80 - i).reduce(0, Integer::sum));
        integerList.stream().collect(Collectors.toList());
    }
}
