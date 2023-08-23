package java8programs.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSet {
	public static void main(String[] args) {
		Student st1 = new Student("john", 02, 05, "it");
		Student st2 = new Student("jack", 03, 06, "csc");
		Student st3 = new Student("mack", 04, 07, "it");
		Student st4 = new Student("elon", 05, 8, "civil");
		Student st5 = new Student("musk", 06, 9, "it");
		Student st6 = new Student("harsha", 07, 10, "mechanacil");
		List<Student> li = new ArrayList<>();
		li.add(st1);
		li.add(st2);
		li.add(st3);
		li.add(st4);
		li.add(st5);
		li.add(st6);
		List<Student> li1 = li.stream().filter(s -> s.branch.equals("it")).collect(Collectors.toList());
		for(Student st:li1) {
			System.out.println(st + "is the  it students");

		}
	}

}
