package T20200306;

import java.io.File;

public class Test2 {
	public static void main(String[] args) {
		File file = new File("..\\Bվ");
		String[] fileStrings = file.list();
		for (String string : fileStrings) {
			System.out.println(string);
		}
	}
}
