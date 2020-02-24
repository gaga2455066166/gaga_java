package ื๗าต0219;

import java.util.*;

public class T2 {

	private static <T> boolean contains(List<T> elements, T element) {
	    for(T e : elements) {
	        if (e.equals(element)) {
	            return true;
	        }
	    }
	    return false;
	}
	public static void main(String[] args) {
	    List<String> list = new ArrayList<>();
	    list.add("a");
	    list.add("f");
	    list.add("b");
	    list.add("c");
	    list.add("a");
	    list.add("d");
	    System.out.println(contains(list, "a"));
	}

}
