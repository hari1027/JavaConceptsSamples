package DataInputStreamExample;

import java.io.DataInputStream;
import java.io.IOException;


public class StringDataInputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter 2 strings");
		String a, b, c;
		a = dis.readLine();
		b = dis.readLine();
		c =  (a + b);
		System.out.println(c);


	}

}
