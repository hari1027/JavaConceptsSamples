package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader reader  = new BufferedReader(new InputStreamReader (System.in));
		char a,b;
		System.out.println("enter 2 characters");
		a= (reader.readLine().charAt(0));
		b= (reader.readLine().charAt(0));
		System.out.println(b);


	}

}
