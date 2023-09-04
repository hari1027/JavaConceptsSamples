package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader (System.in));
		boolean a,b;
		System.out.println("true or false");
		a= Boolean.parseBoolean(reader.readLine());
		b=Boolean.parseBoolean(reader.readLine());
	    System.out.println(a);
	    System.out.println(b);


	}

}
