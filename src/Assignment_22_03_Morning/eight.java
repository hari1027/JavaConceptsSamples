package Assignment_22_03_Morning;

public class eight {

	public static void main(String[] args) {
		String stringData = "Hello friend";
		int i,j;
		
		char encountered[] = new char[stringData.length()];
		int charPos=0;
		
		 for(i=0; i < stringData.length() - 1;i++)
		 {
			 int fre = 1;
			 int enc = 0;
			 
			 for(int k=0; k < encountered.length; k++) {
				 if(encountered[k] == stringData.charAt(i) ) {
					 enc = 1;
					 break;
				 }
			 }
			 
			 if( enc == 0)
			 {
				 encountered[charPos] = stringData.charAt(i);
				 charPos++;
				 
				 for(j=i+1 ;j < stringData.length();j++)
				 {
					 
					 if(stringData.charAt(i) == stringData.charAt(j))
					 { 
						 fre++;
					 }
					
				 }
				 
				 System.out.println(stringData.charAt(i) + " "+ Integer.toString(fre));
			 }	
		 }
		 
	
		
	
		

	}

	private static char String(int fre) {
		// TODO Auto-generated method stub
		return 0;
	}

}
