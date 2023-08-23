package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
public static void main(String[] args) {
List<Integer> li1=Arrays.asList(2,4,5,7,8,9,12,36,14);
Optional<Integer> number=li1.stream().filter(s->s%2==0).findAny();
if(number.isPresent()) {
	System.out.println(number.get());
}
else {
	System.out.println("number does not exist");
}
}
}
