package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader (System.in));
		byte a,b,c;
		System.out.println("enter 2 numbers");
		a= Byte.parseByte(reader.readLine());
		b=Byte.parseByte(reader.readLine());
		c=(byte)(a+b);
		System.out.println(c);

	}

}
