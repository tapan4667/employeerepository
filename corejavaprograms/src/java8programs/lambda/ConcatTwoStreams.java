package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatTwoStreams {
public static void main(String[] args) {
List<String> li1=Arrays.asList("ram","shyam","hari","jam");
List<String> li2=Arrays.asList("laxman","sita","jankai","kausalya");
Stream<String> st1=li1.stream();
Stream<String> st2=li2.stream();
List<String> finallist=Stream.concat(st1,st2).collect(Collectors.toList());
finallist.forEach(System.out::println);
}
}
