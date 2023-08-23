package java8programs.lambda;

import java.util.stream.Stream;

public class TwoStreamsAdd {
public static void main(String[] args) {
Stream<Integer> st1=Stream.empty();
Stream<Integer> st2=Stream.of(22,6,32,33);
Stream<Integer> st3=Stream.concat(st1, st2);
st3.forEach(x->System.out.println(x));
}
}
