package l;

import java.util.ArrayList;
import java.util.Collections;

public class TestList {
	public static void main(String[] args) {
		ArrayList arr= new ArrayList ();
		Collections.addAll(arr, "a","t","c");
		System.out.println(arr);
		System.out.println("-----------------------------");
		Collections.reverse(arr);
		System.out.println(arr);
		System.out.println("-===============================");
		Collections.sort(arr);
		System.out.println(arr);
		System.out.println("-=-=-=-=--=-==-=-=-=--=-=-=-=-=-==-=");
		Collections.shuffle(arr);
		System.out.println(arr);
		System.out.println("**************************************");
		Collections.swap(arr, 0, arr.size()-1);
		System.out.println(arr);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		ArrayList list = new ArrayList ();
		Collections.addAll(list, 10,7,66,444,3,7,2,8);
		System.out.println(list);
		System.out.println(Collections.max(list));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 444));
	}
}
