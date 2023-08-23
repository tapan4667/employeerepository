package java8programs.lambda;

import java.util.Arrays;
import java.util.List;

public class CountExample {
public static void main(String[] args) {
List<Integer> li=Arrays.asList(22,14,45,78,65,36,45,12);
Long count=li.stream().count();
System.out.println(count);
}
}
