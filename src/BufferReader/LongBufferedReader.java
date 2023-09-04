package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongBufferedReader {

	public static void main(String[] args) throws  IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader (System.in));
		long a,b,c;
		System.out.println("enter 2 numbers");
		a= Long.parseLong(reader.readLine());
		b= Long.parseLong(reader.readLine());
		c=(a+b);
		System.out.println(c);


	}

}
