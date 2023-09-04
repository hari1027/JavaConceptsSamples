package String;

public class pojo {

	int roolno;
	String name;
	String city;
	
	

	 pojo(int roolno, String name, String city) {
		super();
		this.roolno = roolno;
		this.name = name;
		this.city = city;
	}

	public int getRoolno() {
		return roolno;
	}

	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void main(String[] args) {
		pojo obj = new pojo(1,"capgemini","chennai");
		System.out.println(obj.getRoolno());
		System.out.println(obj.getName());
		System.out.println(obj.getCity());

	}

	

	
}
