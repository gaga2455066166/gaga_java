package l;

import java.util.Set;
import java.util.TreeSet;

public class TestCompar {
	public static void main(String[] args) {
		Student1 stu1 = new Student1(4, "chen1", 18);
		Student1 stu2 = new Student1(6, "chen1", 18);
		Student1 stu3 = new Student1(1, "chen1", 18);
		Student1 stu4 = new Student1(8, "chen1", 18);
		Set<Student1> setStudent = new TreeSet<Student1>();
		
		setStudent.add(stu1);
		setStudent.add(stu2);
		setStudent.add(stu3);
		setStudent.add(stu4);
		for(Student1 stu : setStudent) {
			System.out.println(stu);
		}
		
		
		
		

	}
}
