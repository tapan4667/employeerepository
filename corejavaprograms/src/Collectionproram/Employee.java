package Collectionproram;

public class Employee implements Comparable<Employee>{
private String name;
private int age;
private int sallery;

public Employee(String name, int age, int sallery) {
	super();
	this.name = name;
	this.age = age;
	this.sallery = sallery;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSallery() {
	return sallery;
}
public void setSallery(int sallery) {
	this.sallery = sallery;
}
@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return 0;
}

}
