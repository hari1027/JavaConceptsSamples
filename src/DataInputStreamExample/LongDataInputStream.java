package DataInputStreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class LongDataInputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter 2 numbers");
		long a, b, c;
		a = Long.parseLong(dis.readLine());
		b = Long.parseLong(dis.readLine());
		c =  (a + b);
		System.out.println(c);

	}

}
