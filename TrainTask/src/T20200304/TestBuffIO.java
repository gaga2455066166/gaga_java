package T20200304;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBuffIO {
	public static void main(String[] args) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("Out.txt"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("OutBuff.txt"));
		int len;
		
		while((len = in.read()) !=-1) {
			out.write(len);
		}	
		
		
		
		
		in.close();
		out.close();
	}
}
