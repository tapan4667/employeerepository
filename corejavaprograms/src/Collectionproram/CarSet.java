package Collectionproram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CarSet {
public static void main(String[] args) {
	CarPriceComparator cc=new CarPriceComparator();
	Car a=new Car("hexa",4,28000000);
	Car b=new Car("nexa",4,780000);
	Car c=new Car("jexa",4,505000);
	Car d=new Car("mexa",4,450000);
	Car e=new Car("nano",4,120000);
HashMap<Car,String> hm=new HashMap<>();
hm.put(a, "ronu");
hm.put(b, "jonu");
hm.put(c, "monu");
hm.put(d, "tonu");
hm.put(e, "my");
Set<Entry<Car,String>> se=hm.entrySet();
for(Entry<Car,String> x:se) {
	Car z=x.getKey();
	System.out.println(z.getBrand());
	System.out.println(z.getPrice());
	System.out.println(z.getWheel());
	System.out.println("=========");

	}

}
}
