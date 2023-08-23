package Collectionproram;

import java.util.ArrayList;
import java.util.List;

public class StudentSet {
public static void main(String[] args) {
Student s1=new Student("tapu",02,"it");
Student s2=new Student("manish",03,"csc");
Student s3=new Student("soubhya",01,"mechanical");
Student s4=new Student("dipak",05,"it");
Student s5=new Student("amani",07,"civil");
List<Student> list1=new ArrayList<>();
List<Student> list2=new ArrayList<>();
list1.add(s1);
list1.add(s2);
list1.add(s3);
list1.add(s4);
list1.add(s5);
for(Student st:list1) {
	String branch=st.getBranch();
	if(branch.equals("it")){
		list2.add(st);
	}
}
for(Student z:list2) {
	System.out.println(z.getName());
	System.out.println(z.getBranch());
	System.out.println(z.getRoolno());
	System.out.println("=============");

}
}
}
