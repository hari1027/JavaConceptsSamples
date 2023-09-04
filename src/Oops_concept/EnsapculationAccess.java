package Oops_concept;

public class EnsapculationAccess {

	public static void main(String[] args) {
		Emp obj = new Emp();
		obj.setEmp_id(141);
		obj.setEmp_name("capgemini");
		obj.setEmp_address("France");
		System.out.println(obj.getEmp_id());
		System.out.println(obj.getEmp_name());
		System.out.println(obj.getEmp_address());
		
	}

}
