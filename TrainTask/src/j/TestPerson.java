package j;

public class TestPerson {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		Person p0 = new Person("»À0");
		add(persons, p0);
		Person p1 = new Person("»À0");
		add(persons, p1);
		Person p2 = new Person("»À0");
		add(persons, p2);
		for (int i = 0; i < 3; i++) {
			if (persons[i].name == null)
				System.out.println("null");
			else
				System.out.println(persons[i].name);
		}
		System.out.println("del p0");
		del(persons, p0);
		for (int i = 0; i < 3; i++) {
			if (persons[i]== null)
				System.out.println("null");
			else
				System.out.println(persons[i].name);
		}
		System.out.println("update p1");
		update(persons, p1);
		System.out.println(p1.name);

	}

	public static void del(Person[] arr, Person delPerson) {
		for (int i = 0; i < 3;) {
			if (arr[i] == delPerson)
				arr[i] = null;
			else
				i++;
		}
	}

	public static void add(Person[] arr, Person addPerson) {
		for (int i = 0; i < 3;) {
			if (arr[i] == null) {
				arr[i] = addPerson;
				break;
			} else
				i++;
		}
	}

	public static void update(Person[] arr, Person updatePerson) {
		for (int i = 0; i < 3;) {
			if (arr[i] == updatePerson)
				arr[i].name = "updatePerson";
			else
				i++;
		}
	}

	public static Person find(Person[] arr, Person findPerson) {
		for (int i = 0; i < 3;) {
			if (arr[i].name == findPerson.name)
				return findPerson;
			else
				i++;
		}
		return null;
	}

}
