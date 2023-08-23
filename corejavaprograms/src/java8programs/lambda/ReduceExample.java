package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
public static void main(String[] args) {
List<String> li=Arrays.asList("tapan","kumar","nayak");
Optional<String> opt=li.stream().reduce((x,y)->{return x+y;});
System.out.println(opt.get());
}
}
