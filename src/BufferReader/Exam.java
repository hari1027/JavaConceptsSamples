package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter 2 strings");
		String a,b ;
		a=buffer.readLine();
		b=buffer.readLine();
		
		String c= a+" "+b ;
		
		char d;
		System.out.println("enter a character");
		d=buffer.readLine().charAt(0);
		
		String e="is";
		
		float f;
		System.out.println("enter a float number");
		f=Float.parseFloat(buffer.readLine());
		
		boolean g;
		System.out.println("enter true or false");
		g=Boolean.parseBoolean(buffer.readLine());
		
		System.out.println(c +" "+d+" "+e+" "+f);
		System.out.println(g);
		

	}

}
