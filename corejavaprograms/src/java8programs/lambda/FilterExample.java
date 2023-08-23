package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{
	String name;
	int sallery;
	public Employee1(String name,int sallery) {
		this.name=name;
		this.sallery=sallery;
	}
}
public class FilterExample {
public static void main(String[] args) {
List<Employee1> li=Arrays.asList(new Employee1("john",20000),new Employee1("jack",45000),new Employee1("mack",15000));
List<Integer> li1=li.stream().filter(s->s.sallery>10000).map(s->s.sallery+2000).collect(Collectors.toList());
li1.forEach(System.out::println);
}
}
