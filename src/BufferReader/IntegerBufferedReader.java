package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerBufferedReader {

	public static void main(String[] args) throws  IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader (System.in));
		int a,b,c;
		System.out.println("enter 2 numbers");
		a= Integer.parseInt(reader.readLine());
		b=Integer.parseInt(reader.readLine());
		c=(a+b);
		System.out.println(c);


	}

}
