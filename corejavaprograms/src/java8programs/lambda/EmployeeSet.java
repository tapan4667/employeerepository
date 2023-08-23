package java8programs.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSet {
	public static void main(String[] args) {
		List<Employee> li1 = Arrays.asList(new Employee("john", 02, 12500), new Employee("jack", 03, 13500),
				new Employee("mack", 04, 14000));
		List<Employee> li2 = li1.stream().filter(s -> s.sallery >= 12501).collect(Collectors.toList());
		li2.forEach(System.out::println);
	}
}
