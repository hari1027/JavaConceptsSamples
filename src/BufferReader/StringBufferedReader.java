package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader (System.in));
		String a,b,c;
		System.out.println("enter 2 strings");
		a= (reader.readLine());
		b= (reader.readLine());
		c= (a+b);
		System.out.println(c);


	}

}
