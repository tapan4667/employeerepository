package java8programs.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student1{
	String name;
	int roolNo;
	public Student1(String name,int roolNo) {
		this.name=name;
		this.roolNo=roolNo;
	}
}
public class ObjectToName {
public static void main(String[] args) {
List<Student1> li=new ArrayList<>();
li.add(new Student1("jack",2));
li.add(new Student1("mack",6));
li.add(new Student1("sack",7));
List<Student1> li1=new ArrayList<>();
li1.add(new Student1("nack",8));
li1.add(new Student1("sili",9));
List<List<Student1>> li2=Arrays.asList(li,li1);
List<String> studentsname=li2.stream().flatMap(x->x.stream()).map(v->v.name).collect(Collectors.toList());

System.out.println(studentsname);
}
}
