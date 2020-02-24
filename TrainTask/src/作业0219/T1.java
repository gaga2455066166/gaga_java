package ื๗าต0219;


import java.util.*;

public class T1 {
	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");
		
		HashSet<String> hashSet = new HashSet<>(list);
	    list = new ArrayList<>(hashSet);
	    System.out.println(list);

		 
	}


}
