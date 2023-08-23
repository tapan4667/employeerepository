package java8programs.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LabourFilter {
	public static void main(String[] ars) {
		Labour l1 = new Labour("praful", 01, 10000);
		Labour l2 = new Labour("jack", 02, 12500);
		Labour l3 = new Labour("mack", 03, 14000);
		Labour l4 = new Labour("tapu", 04, 20000);
		Labour l5 = new Labour("mapu", 05, 22000);
		List<Labour> li1 = new ArrayList<>();
		List<Labour> li2 = new ArrayList<>();
		li1.add(l1);
		li1.add(l2);
		li1.add(l3);
		li2.add(l4);
		li2.add(l5);
		List<List<Labour>> finallist = Arrays.asList(li1, li2);
		List<Labour> sallerylist = finallist.stream().flatMap(s -> s.stream()).filter(s -> s.sallery >= 14000)
				.collect(Collectors.toList());
		sallerylist.forEach(System.out::println);
	}
}
