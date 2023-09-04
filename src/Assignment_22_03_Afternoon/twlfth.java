package Assignment_22_03_Afternoon;
import java.util.*;

public class twlfth {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a string");
		String st = sc.nextLine();
		
		char arr1[] = st.toCharArray();
		
		int letters=0,spaces=0,numbers=0,othercharacters=0;
		
		for(int i=0;i<st.length();i++)
		{
			if(Character.isLetter(arr1[i]))
			{
				letters++;
			}
			else if(Character.isDigit(arr1[i]))
			{
				numbers++;
			}
			else if(Character.isSpaceChar(arr1[i]))
			{
				spaces++;
			}
			else
			{
				othercharacters++;
			}
		}
		System.out.println("the letters in the string is :" + letters);
		System.out.println("the numbers in the string is :" + numbers);
		System.out.println("the spaces in the string is :" + spaces);
		System.out.println("the othercharacters in the string is :" + othercharacters);

	}
}


