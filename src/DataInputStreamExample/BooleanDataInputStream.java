package DataInputStreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class BooleanDataInputStream {

	public static void main(String[] args) throws IOException  {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter true or false");
		boolean a, b;
		a = Boolean.parseBoolean (dis.readLine());
		b = Boolean.parseBoolean (dis.readLine());
		System.out.println(b);
		System.out.println(b);

	}

}
