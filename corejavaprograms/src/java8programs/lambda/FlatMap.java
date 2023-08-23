package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
public static void main(String[] args) {
List<String> li=Arrays.asList("jack","mack","john");
List<Character> li1=li.stream().flatMap(s->s.chars().mapToObj(c->(char)c)).distinct().collect(Collectors.toList());
System.out.println(li1);
}
}
