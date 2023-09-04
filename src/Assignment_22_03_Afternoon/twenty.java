package Assignment_22_03_Afternoon;

public class twenty {

	public static void main(String[] args) {
		int i;
		int count;
		int limit = 1;
		int add = 0;
		
		for (i=2 ;limit<=100 ;i++) 
			{
			    count = 0;
				for (int j = i - 1; j > 1; j--) 
				{
					if (i % j == 0) 
					{
						count = 1;
						break ;
					}
				}

				if (count == 0)
				{
//					System.out.println(Integer.toString(i));
					add = add + i;
					limit = limit + 1;
				}
				
			}
		   System.out.println("sum of first 100 primenumbers are "+ add);
	
		
		}
			
			
	}
	



