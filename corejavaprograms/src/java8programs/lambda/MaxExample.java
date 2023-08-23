package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxExample {
public static void main(String[] args) {
List<Integer> li=Arrays.asList(22,65,78,98,52,12);
Optional<Integer> num=li.stream().max((x,y)->{return x.compareTo(y);});
System.out.println(num.get());
}
}
