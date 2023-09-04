package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleBufferedReader {

	public static void main(String[] args) throws  IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader (System.in));
		double a,b,c;
		System.out.println("enter 2 numbers");
		a= Double.parseDouble(reader.readLine());
		b=Double.parseDouble(reader.readLine());
		c=(a+b);
		System.out.println(c);


	}

}
