package l;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestWorld {
	public static void main(String[] args) {
		World world1 = new World("��һ��","1930��","������");
		World world2 = new World("�ڶ���","1934��","�����");
		World world3 = new World("������","1938��","�����");
		World world4 = new World("���Ľ�","1950��","������");
		World world5 = new World("�����","1954��","����");
		World world6 = new World("������","1958��","����");
		World world7 = new World("���߽�","1962��","����");
		World world8 = new World("�ڰ˽�","1966��","Ӣ����");
		World world9 = new World("�ھŽ�","1970��","����");
		World world10 = new World("��ʮ��","1974��","����");
		Set<World> worldSet = new TreeSet<World> ();
		worldSet.add(world1);
		worldSet.add(world2);
		worldSet.add(world3);
		worldSet.add(world4);
		worldSet.add(world5);
		worldSet.add(world6);
		worldSet.add(world7);
		worldSet.add(world8);
		worldSet.add(world9);
		worldSet.add(world10);
		String yearString;
		Scanner scanner = new Scanner(System.in);
		yearString = scanner.nextLine();
		System.out.println();
		
		
		
		
		
	}
}
