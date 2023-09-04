package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortBufferedReader {

	public static void main(String[] args) throws  IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader (System.in));
		short a,b,c;
		System.out.println("enter 2 numbers");
		a= Short.parseShort(reader.readLine());
		b=Short.parseShort(reader.readLine());
		c=(short)(a+b);
		System.out.println(c);


	}

}
