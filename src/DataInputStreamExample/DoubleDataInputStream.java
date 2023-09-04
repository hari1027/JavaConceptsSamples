package DataInputStreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class DoubleDataInputStream {

	public static void main(String[] args) throws IOException  {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter 2 numbers");
		double a, b, c;
		a = Double.parseDouble(dis.readLine());
		b = Double.parseDouble(dis.readLine());
		c =  (a + b);
		System.out.println(c);

	}

}
