package DataInputStreamExample;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterDataInputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter 2 characters");
		char a, b;
		a = dis.readLine().charAt(0);
		b = dis.readLine().charAt(0);
		System.out.println(b);
		

	}

}
