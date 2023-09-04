package ExceptionHandling;

import java.io.DataInputStream;
import java.io.IOException;

public class BasicException {

	public static void main(String[] args) throws IOException  {
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("enter 2 numbers");
			byte a, b, c;
			try
			{
			a = Byte.parseByte(dis.readLine());
			b = Byte.parseByte(dis.readLine()); 
		    c = (byte) (a + b);
		    System.out.println(c);
		    if (c>10) throw new ArithmeticException ();
		     }
		catch (NumberFormatException e)
		{
			System.out.println("enter a byte range number " +e);
		} 
		catch (IOException e)
		{
			System.out.println(e);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithemetic error " + e);
		}
		finally
		{
			dis.close();
		}
			

	}

}
