package String;

public class replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       StringBuffer sb = new StringBuffer ("High cost");
       sb.replace(0,4,"low");
       System.out.println("replace string is :" +sb );//replace characters from 0 to (4-1)
       StringBuffer st = new StringBuffer ("High cost");
       System.out.println(st.replace(2,3,"b"));
       
       
	}

}
	


