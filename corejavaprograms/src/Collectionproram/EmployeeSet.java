package Collectionproram;

import java.util.TreeSet;

public class EmployeeSet {
public static void main(String[] args) {
TreeSet<Employee> ts=new TreeSet<>();
Employee a=new Employee("john",23,23000);
Employee b=new Employee("jack",22,2220);
Employee c=new Employee("mack",24,28000);
Employee d=new Employee("sack",24,38000);
Employee e=new Employee("nack",82,23000);
ts.add(a);
ts.add(b);
ts.add(c);
ts.add(d);
ts.add(e);
for(Employee x:ts) {
	System.out.println(x.getName());
	System.out.println(x.getSallery());
	System.out.println(x.getAge());
	System.out.println("===========");

}
}
}
