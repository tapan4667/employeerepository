package interviewprepare.com;

public class Test {
public  void ifExample(int a) {
	if(a%2==0) {
		System.out.println(a+"is the even number");
	}
	else {
		System.out.println(a+"is the odd number");
	
	}
}
public void whileExample() {
	int i=1;
	while(i<=10) {
		System.out.println(i);
		i++;
	}
}
public void forExample() {
	for(int i=0;i<=10;i++) {
	System.out.println(i);	
	}
}
public void doWhileExample() {
	int i=1;
	do {
		System.out.println(i);
		i++;
	}while(i<=10);
}
public static void main(String[]args) {
	Test t=new Test();
	t.ifExample(22);
t.whileExample();
t.forExample();
t.doWhileExample();
}
}
