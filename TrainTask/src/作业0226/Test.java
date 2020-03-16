package ��ҵ0226;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<Student ,String>();
		map.put(new Student("��С��", 18), "����");
        map.put(new Student("�µܵ�", 18), "����");
        map.put(new Student("�����", 18), "����");
        map.put(new Student("���", 15), "����");
        map.put(new Student("�ֶ���", 3), "����");
        
        System.out.println("1.����ֵ��");
        Set<Student> students = map.keySet();
        for(Student student : students) {//��ǿfor
            System.out.println(String.format("%s :: %s", student, map.get(student)));
        }
        
        System.out.println("2.����ֵ");
        Set<Student> students1 = map.keySet();
        Collection<String> address = map.values();
        Iterator<Student> iterator = students1.iterator();
        Iterator<String> addressesIterator = address.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("%s::%s", iterator.next(), addressesIterator.next()));
        }
      
        
        System.out.println("3.��ֵ�ԣ�");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(String.format("%s :: %s", entry.getKey(), entry.getValue()));
        }
        
        
        
        
        System.out.println("4.foreach");
        map.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(String.format("%s::%s", student, s));
            }
        });




	}
}
