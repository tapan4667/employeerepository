package java8programs.lambda;

public class Student {
String name;
int roolNo;
int id;
String branch;
public Student(String name, int roolNo, int id, String branch) {
	super();
	this.name = name;
	this.roolNo = roolNo;
	this.id = id;
	this.branch = branch;
}
@Override
public String toString() {
	return "Students [name=" + name + ", roolNo=" + roolNo + ", id=" + id + ", branch=" + branch + "]";
}


}
