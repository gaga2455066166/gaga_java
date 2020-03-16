package T20200306;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("T20200306_in.txt") );
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("T20200306_out.txt"));
		String string ;
		while ((string = bufferedReader.readLine())!=null) {
			bufferedWriter.write(string);
			bufferedWriter.newLine();
		}
		bufferedReader.close();
		bufferedWriter.close();
	}
}
