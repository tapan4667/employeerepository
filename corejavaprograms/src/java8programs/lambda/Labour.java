package java8programs.lambda;

public class Labour {
String name;
int id;
int sallery;
public Labour(String name, int id, int sallery) {
	super();
	this.name = name;
	this.id = id;
	this.sallery = sallery;
}
public String toString(){
	return name+" "+id+" "+sallery;
}
}
