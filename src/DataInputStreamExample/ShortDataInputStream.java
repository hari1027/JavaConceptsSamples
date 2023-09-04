package DataInputStreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class ShortDataInputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter 2 numbers");
		short a, b, c;
		a = Short.parseShort(dis.readLine());
		b = Short.parseShort(dis.readLine());
		c = (short) (a + b);
		System.out.println(c);

	}

}
