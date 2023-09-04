package DataInputStreamExample;

import java.io.*;

public class ByteDataInputStream {

	/**
	 * @param args
	 * @throws
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) {

		// Either use try.. catch ... block or use throws keyword

		try {
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("enter 2 numbers");
			byte a, b, c;
			a = Byte.parseByte(dis.readLine());
			b = Byte.parseByte(dis.readLine());
			c = (byte) (a + b);
			System.out.println(c);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
