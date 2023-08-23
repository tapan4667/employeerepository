package java8programs.lambda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FlatMapToIntExample {
public static void main(String[] args) {
int [] [] arr= {{1,2,3},{8,5,9},{5,8,9}};
IntStream num=Arrays.stream(arr).flatMapToInt(Arrays::stream);
num.forEach(x->System.out.println(x));
}
}
