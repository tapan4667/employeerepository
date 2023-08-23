package java8programs.lambda;

import java.util.Arrays;
import java.util.List;

public class DistintExample {
	//duplicates are not allowed
public static void main(String[] args) {
List<Integer> li=Arrays.asList(22,55,44,33,22,16,41,87);
List<Integer> li1=li.stream().distinct().toList();
li1.forEach(System.out::println);
}
}
