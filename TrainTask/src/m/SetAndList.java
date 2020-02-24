package m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetAndList {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		set.add("1");
		set.add("3");
		set.add("2");
		set.add("4");
		set.add("1");
		list.add("1");
		list.add("3");
		list.add("2");
		list.add("4");
		list.add("1");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("上面list-----下面set------------");
		it = set.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
