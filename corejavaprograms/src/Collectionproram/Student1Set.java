package Collectionproram;

import java.util.TreeSet;

public class Student1Set {
public static void main(String[] args) {
	Student1MarkComparator sc=new Student1MarkComparator();
	Student1 a=new Student1("jack",12,210);
	Student1 b=new Student1("mack",13,280);
	Student1 c=new Student1("sack",14,220);
	Student1 d=new Student1("aack",15,230);
	Student1 e=new Student1("jhaack",18,240);
	Student1 f=new Student1("john",22,220);
	TreeSet<Student1> ts=new TreeSet<>(sc);
	ts.add(a);
	ts.add(b);
	ts.add(c);
	ts.add(d);
	ts.add(e);
	ts.add(f);
	ts.stream().forEach(System.out::println);
}
}
