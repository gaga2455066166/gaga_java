package m;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Test {

	public static void main(String[] args) {

        // HashMap�����Map�е�key����ȥ��
        Map<Student, String> map = new HashMap<Student, String>();
        // ��������
        map.put(new Student("����", 18), "�Ϻ�");
        map.put(new Student("����", 18), "����");
        map.put(new Student("����", 18), "����");
        map.put(new Student("С��", 15), "����");
        map.put(new Student("С��", 18), "����");

        // 1.ͨ����������ֵ�ķ�ʽ
        Set<Student> keyStudents = map.keySet();
        Iterator<Student> iterator1 = keyStudents.iterator();
        while(iterator1.hasNext()) {
        	Student student = iterator1.next();
        	String value = map.get(student);
        	System.out.println(student.toString() + "=" +value);
        }
        // 2.ͨ����ֵ�Է�ʽ
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }


	}
}
