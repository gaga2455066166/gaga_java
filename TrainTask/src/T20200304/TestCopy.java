package T20200304;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("Out.txt");
		FileOutputStream out = new FileOutputStream("OutCopy.txt");
		int len;
		byte[] b = new byte[2048];
//		while((len = in.read()) !=-1) {
//			out.write(len);
//		}
		while((len = in.read(b)) !=-1) {
			out.write(b);
		}	
		
		
		while((len = in.read(b)) !=-1) {
			out.write(b,0,len);
		}
		
		
		
		
		in.close();
		out.close();
	}
}
