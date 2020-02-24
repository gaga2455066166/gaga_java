package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student(1,"student1",19);
		Student s2 = new Student(3,"student2",19);
		Student s3 = new Student(2,"student3",19);
		Student s4 = new Student(4,"student4",19);
		Student s5 = new Student(5,"student5",19);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Student student = (Student)  iterator.next();
			System.out.println(student);
		}
		
		System.out.println("----------------------------");
		Worker worker = new Worker("zhang3",18,3000);
		Worker worker1 = new Worker("li4",25,3500);
		Worker worker2 = new Worker("wang5",22,3200);
		ArrayList<Worker> list1 = new ArrayList<Worker>();
		list1.add(worker);
		list1.add(worker1);
		list1.add(worker2);
		
		Worker worker3 = new Worker("zhao5",24,3500);
		list1.add(1, worker3);
		
		Iterator iterator1 = list1.iterator();
		while(iterator1.hasNext()) {
			Worker work = (Worker)  iterator1.next();
			System.out.println(work);
		}
		System.out.println("-----------------------------");
		
		HashSet<Worker> hashSet = new HashSet<Worker>();
		hashSet.add(worker);
		hashSet.add(worker2);
		hashSet.add(worker3);
		hashSet.add(worker1);
		for(Worker work0 : hashSet) {
			System.out.println(work0);
		}
		
		
	}
}





