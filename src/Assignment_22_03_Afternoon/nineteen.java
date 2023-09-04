package Assignment_22_03_Afternoon;
import java.util.*;

public class nineteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the seconds value");
		int sec = sc.nextInt();
		
		int hours=0,mins=0,secs=0 ;

			   hours = (sec/3600 ) ;
			   sec = sec%3600;
			   
			   
			   if(sec>=60)
			   mins= (sec/60);
			   sec = sec%60;
			   
			   if(sec<60)
			   secs=sec;
			   
			   
			   System.out.println( hours +  "hours");
			   System.out.println( mins + "minutes");
			   System.out.println( secs + "seconds");
			   
			   
			   
		
		
		
			
		

		}
		

	}


