package java8programs.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
public static void main(String[] args) {
List<Integer> li=Arrays.asList(55,44,18,63,23,24,22,20);
//List<Integer> li1=li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//li1.forEach(System.out::println);
List<Integer> li2=li.stream().sorted().collect(Collectors.toList());
li2.forEach(System.out::println);
}
}
