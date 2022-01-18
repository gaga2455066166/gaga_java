package test;

import com.cjl.vo.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    @Test
    public void TestMethod1(){
        Person person = new Person();
        person.setId(1);
        person.setAge(12);
        person.setName("xm");
        Gson gson = new Gson();
        String s = gson.toJson(person);
        System.out.println(s);

        System.out.println("----------------换回来-------------");
        Person p = gson.fromJson(s,Person.class);
        System.out.println(p);

        System.out.println("----------------LIST--------------");
        person.setId(2);
        person.setName("sx");
        List<Person> personList = new ArrayList<>();
        personList.add(p);
        personList.add(person);
        String s1 = gson.toJson(personList);
        System.out.println(s1);

        System.out.println("---------------list换回来-----------");
        List<Person> list = gson.fromJson(s1,new TypeToken<List<Person>>(){}.getType());
        System.out.println(list);
    }
}
