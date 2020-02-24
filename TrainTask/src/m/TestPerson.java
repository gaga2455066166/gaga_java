package m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPerson {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("01", "张三", "男"));
		set.add(new Person("02", "李四", "男"));
		set.add(new Person("03", "王五", "男"));
		set.add(new Person("03", "张三", "男"));
		set.add(new Person("04", "小明", "男"));
		set.add(new Person("05", "赵六", "男"));
		show(set);
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			Person person = it.next();
			if (person.getIdString().equals("05")) {
				set.remove(person);
				break;
			}
		}
		System.out.println("-------------------");
		show(set);
	}

	public static void show(Set<Person> set) {
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			Person person = it.next();
			System.out.println(person);
		}
	}
}
