package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
public static void main(String[] args) {
List<String> li=Arrays.asList("john","jack","mack");
List<String> li1=li.stream().limit(1).collect(Collectors.toList());
li1.forEach(System.out::println);
}
}
