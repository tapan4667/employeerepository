package interviewprepare.com;

public class ConnectionUtil1 {
public static ConnectionUtil1 util;
public ConnectionUtil1 getConnection() {
	if(util==null) {
	util=new  ConnectionUtil1();	
	}
	 return util;
}
}
//singleton design patterns
