package DataInputStreamExample;

import java.io.DataInputStream;
import java.io.IOException;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter 2 numbers");
			int a,b,c;
			a=Integer.parseInt(dis.readLine());
			b=Integer.parseInt(dis.readLine());
			c=a+b ;
		
			
			System.out.println("enter 2 strings");
			String d,e,f;
			d=dis.readLine();
			e=dis.readLine();
			f=d+" "+e;
			
			
			System.out.println("enter a character");
			char g;
			g=dis.readLine().charAt(0);
		
			
			System.out.println("enter true or false");
			boolean h;
			h=Boolean.parseBoolean(dis.readLine());
			
			System.out.print(c+" ");
			System.out.print(f +" ");
			System.out.println(g);
			System.out.println(h);
			
			
			
		}
		catch (IOException e){
			e.printStackTrace();
		}

	}

}
