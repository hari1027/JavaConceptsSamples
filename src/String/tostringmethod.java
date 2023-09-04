package String;

public class tostringmethod {

	int roolno;
	String name;
	String city;
	
	public tostringmethod(int roolno, String name, String city) {
		super();
		this.roolno = roolno;
		this.name = name;
		this.city = city;
	}
	
	
	public String toString() {
		return " [roolno=" + roolno + ", name=" + name + ", city=" + city + "]";
	}
	
	public static void main(String[] args) {
		tostringmethod s= new tostringmethod (1,"capgemini","chennai");
		System.out.println(s);

	}

	

}
