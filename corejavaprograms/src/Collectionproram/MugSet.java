package Collectionproram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MugSet {
public static void main(String[] args) {
Mug a=new Mug("nilkamal",200,2);	
Mug b=new Mug("ankur",250,2);	
Mug c=new Mug("gangu",230,2);	
Mug d=new Mug("anmol",120,2);	
Mug e=new Mug("super",209,2);	
Mug f=new Mug("jhakas",100,2);	
HashMap<Mug,String> hm=new HashMap();
hm.put(a, "jack");
hm.put(b, "mack");
hm.put(c, "john");
hm.put(d, "mohn");
hm.put(e, "sohan");
hm.put(f, "hero");
Set<Entry<Mug,String>> se=hm.entrySet();
for(Entry<Mug,String> x:se) {
Mug m=x.getKey();
System.out.println(m.getBrandName());
System.out.println(m.getPrice());
System.out.println(m.getCapacity());
System.out.println("=============");
}
}
}
