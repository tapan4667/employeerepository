package Collectionproram;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LaptopSet {
public static void main(String[] args) {
Laptop a=new Laptop("dell",50000,"black",101);
Laptop b=new Laptop("hp",80000,"white",108);
Laptop c=new Laptop("lenvo",70000,"purple",104);
Laptop d=new Laptop("infono",58000,"green",109);
Laptop e=new Laptop("lava",5500,"yellow",102);
TreeMap<Laptop,String> tm=new TreeMap<>();
tm.put(a, "jack");
tm.put(b, "mack");
tm.put(c, "sack");
tm.put(d, "nack");
tm.put(e, "tapu");
Set<Entry<Laptop,String>> se=tm.entrySet();
for(Entry<Laptop,String> x:se) {
	Laptop z=x.getKey();
	System.out.println(z.getBrand());
	System.out.println(z.getColour());
	System.out.println(z.getPrice());
	System.out.println(z.getKeys());
	System.out.println("==========");
}
}
}
