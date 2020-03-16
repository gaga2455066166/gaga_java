package 作业0226;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<Student ,String>();
		map.put(new Student("陈小歌", 18), "漳浦");
        map.put(new Student("陈弟弟", 18), "福州");
        map.put(new Student("王大二", 18), "北京");
        map.put(new Student("李长寿", 15), "美国");
        map.put(new Student("林短命", 3), "东京");
        
        System.out.println("1.键找值：");
        Set<Student> students = map.keySet();
        for(Student student : students) {//增强for
            System.out.println(String.format("%s :: %s", student, map.get(student)));
        }
        
        System.out.println("2.键和值");
        Set<Student> students1 = map.keySet();
        Collection<String> address = map.values();
        Iterator<Student> iterator = students1.iterator();
        Iterator<String> addressesIterator = address.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("%s::%s", iterator.next(), addressesIterator.next()));
        }
      
        
        System.out.println("3.键值对：");
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
