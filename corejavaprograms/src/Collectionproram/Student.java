package Collectionproram;

public class Student {
private String name;
private int roolno;
private String branch;
public Student(String name, int roolno, String branch) {
	super();
	this.name = name;
	this.roolno = roolno;
	this.branch = branch;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoolno() {
	return roolno;
}
public void setRoolno(int roolno) {
	this.roolno = roolno;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}

}
