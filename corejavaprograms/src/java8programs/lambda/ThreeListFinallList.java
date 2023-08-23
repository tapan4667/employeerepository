package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeListFinallList {
public static void main(String[] args) {
List<Integer> li1=Arrays.asList(22,24,55,60);
List<Integer> li2=Arrays.asList(45,50,66,40);
List<Integer> li3=Arrays.asList(85,14,20,32);
List<Integer> li4=Arrays.asList(47,85,95,32);
List<List<Integer>> originallist=Arrays.asList(li1,li2,li3,li4);
List<Integer> result=originallist.stream().flatMap(z->z.stream().map(a->a+10)).collect(Collectors.toList());
System.out.println(result);
}
}
