package DataInputStreamExample;
import java.io.DataInputStream;
import java.io.IOException;

public class FloatDataInputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter 2 numbers");
		float a, b, c;
		a = Float.parseFloat(dis.readLine());
		b = Float.parseFloat(dis.readLine());
		c =  (a + b);
		System.out.println(c);

	}

}
