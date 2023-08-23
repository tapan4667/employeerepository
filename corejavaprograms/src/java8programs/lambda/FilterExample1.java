package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {
public static void main(String[] args) {
List<Integer> li=Arrays.asList(22,24,36,55,99,78,3);
List<Integer> li1=li.stream().filter(s->s%2==0).collect(Collectors.toList());
li1.forEach(System.out::println);
}
}
