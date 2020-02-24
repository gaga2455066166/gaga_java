package l;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestWorld {
	public static void main(String[] args) {
		World world1 = new World("第一届","1930年","乌拉圭");
		World world2 = new World("第二届","1934年","意大利");
		World world3 = new World("第三届","1938年","意大利");
		World world4 = new World("第四届","1950年","乌拉圭");
		World world5 = new World("第五届","1954年","西德");
		World world6 = new World("第六届","1958年","巴西");
		World world7 = new World("第七届","1962年","巴西");
		World world8 = new World("第八届","1966年","英格兰");
		World world9 = new World("第九届","1970年","巴西");
		World world10 = new World("第十届","1974年","西德");
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
