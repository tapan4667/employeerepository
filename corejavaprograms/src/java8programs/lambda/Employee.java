package java8programs.lambda;

public class Employee {
String name;
int id;
int sallery;
public Employee(String name, int id, int sallery) {
	super();
	this.name = name;
	this.id = id;
	this.sallery = sallery;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", sallery=" + sallery + "]";
}

}
