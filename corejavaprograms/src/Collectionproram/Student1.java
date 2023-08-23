package Collectionproram;

public class Student1 {
private String name;
private int roolNo;
private int mark;

public Student1(String name, int roolNo, int mark) {
	super();
	this.name = name;
	this.roolNo = roolNo;
	this.mark = mark;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoolNo() {
	return roolNo;
}
public void setRoolNo(int roolNo) {
	this.roolNo = roolNo;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
@Override
public String toString() {
	return "Student1 [name=" + name + ", roolNo=" + roolNo + ", mark=" + mark + "]";
}

}
