package interviewprepare.com;

import java.util.ArrayList;
import java.util.List;
class Employee{
	String name;
	int salleery;
	int id;
	
	public Employee(String name, int salleery, int id) {
		super();
		this.name = name;
		this.salleery = salleery;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalleery() {
		return salleery;
	}
	public void setSalleery(int salleery) {
		this.salleery = salleery;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salleery=" + salleery + ", id=" + id + "]";
	}
	
}
public class Test1 {
public static void main(String[] args) {
List<Employee> li=new ArrayList<>();
Employee a=new Employee("jack",10000,1);
Employee b=new Employee("mack",11000,2);
Employee c=new Employee("sack",12000,3);
Employee d=new Employee("mona",13000,4);
Employee e=new Employee("sona",18000,5);
li.add(a);
li.add(b);
li.add(c);
li.add(d);
li.add(e);
li.stream().filter(s->s.salleery>=10000).forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}