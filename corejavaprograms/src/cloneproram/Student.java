package cloneproram;

public class Student implements Cloneable {
	String name;
	int roolNo;

	public  Student(String name, int roolNo) {
		this.name = name;
		this.roolNo = roolNo;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			Student st = new Student("jack", 12);
			Student st1 = (Student) st.clone();
			System.out.println(st.name + "  " + st.roolNo);
			System.out.println(st1.name + "  " + st1.roolNo);
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		} finally {
			System.out.println("exception is finally catched");
		}

	}
}
