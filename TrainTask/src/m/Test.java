package m;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Test {

	public static void main(String[] args) {

        // HashMap仅针对Map中的key进行去重
        Map<Student, String> map = new HashMap<Student, String>();
        // 匿名对象
        map.put(new Student("张三", 18), "上海");
        map.put(new Student("李四", 18), "北京");
        map.put(new Student("王五", 18), "杭州");
        map.put(new Student("小明", 15), "广州");
        map.put(new Student("小红", 18), "深圳");

        // 1.通过遍历键找值的方式
        Set<Student> keyStudents = map.keySet();
        Iterator<Student> iterator1 = keyStudents.iterator();
        while(iterator1.hasNext()) {
        	Student student = iterator1.next();
        	String value = map.get(student);
        	System.out.println(student.toString() + "=" +value);
        }
        // 2.通过键值对方式
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }


	}
}
