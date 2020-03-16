package T20200304;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("T20200304.txt");
//		int a = in.read();
//		System.out.print((char)a);
//		while ((a = in.read())!=-1) {
//			System.out.print((char)a);
//			
//		}
//		
		
		byte[] bytes1 = new byte[10];
		int a0 = in.read(bytes1);
		System.out.println(new String(bytes1,0,a0-4,"utf-8"));
		in.close();
		
		FileOutputStream out = new FileOutputStream("Out.txt",true);
		String javaString  = "java¿Î³Ì";
		byte[] bytes2= javaString.getBytes();
		out.write(bytes2);
		
//		for (int i = 0; i < bytes.length; i++) {
//			byte b = bytes[i];
//			System.out.print((char)b);
//		}
		out.close();
	}
}
