package interviewprepare.com;

public class ConnectionUtil {
public static ConnectionUtil util;
public ConnectionUtil getConnection() {
	if(util==null) {
		util=new ConnectionUtil();
	}
	return util;
	//hi
}
}