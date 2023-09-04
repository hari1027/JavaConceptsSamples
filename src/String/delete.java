package String;

public class delete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("welcome to java");
		sb.delete(4,8);//will delete from char 4 to (8 -1) 
		StringBuffer st = new StringBuffer("welcome to java");
		st.deleteCharAt(10);// 10th character will be deleted
		System.out.println(sb);
		System.out.println(st);

	}

}
