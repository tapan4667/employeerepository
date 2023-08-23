package java8programs.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
public static void main(String[] args) {
List<String> li1=Arrays.asList("jack","mack","sack");
List<String> li2=Arrays.asList("tapan","abdul","praful");
List<String> li3=Arrays.asList("movan","mohan","nipun");
List<List<String>> finallist=new ArrayList<>();
finallist.add(li1);
finallist.add(li2);
finallist.add(li3);
finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList()).forEach(System.out::println);
}
}
