package DataInputStreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class IntegerInputDataStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter 2 numbers");
		int a, b, c;
		a = Integer.parseInt(dis.readLine());
		b = Integer.parseInt(dis.readLine());
		c =  (a + b);
		System.out.println(c);

	}

}
