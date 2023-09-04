package Assignment_25_03_Morning;
import java.util.*;

class Test{
	public void addPolicyDetails(TreeMap<Integer, String> sortedpolicy)
	{
		TreeMap<Integer , String> policytaken = new TreeMap<>();
		policytaken.putAll(sortedpolicy);
		 //System.out.println(policytaken);
	}
	
	public TreeMap<Integer, String> searchBasedOnPolicyType(TreeMap<Integer, String> sortedpolicy)
	{
		TreeMap<Integer , String> policyId = new TreeMap<>();
		policyId.putAll(sortedpolicy);
		
		System.out.println("enter 1 for Health policy. "+" enter 2 for two wheeler policy");
		System.out.println("enter the type policy you need");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		
		if(m == 1)
		{
			policyId.remove(20145);
			policyId.remove(20165);
		}
		
		if(m == 2)
		{
			policyId.remove(10110);
			policyId.remove(10321);
			policyId.remove(10654);
		}
		
		return policyId;
	}
}

public class InsuranceCompany {

	public static void main(String[] args) {
		HashMap<Integer , String> policy = new HashMap<> ();
		
		
		policy.put(10110," Reliance Heath Insurance ");
		policy.put(10321," Sbi Health Insurance ");
		policy.put(10654," Health Insurance ");
		policy.put(20145," Tvs Two Wheeler Insurance ");
		policy.put(20165," New India Assurance Two Wheeler Insurance ");
		
		TreeMap<Integer,String>sortedpolicy = new TreeMap<>();
		
		sortedpolicy.putAll(policy);
		
		for(Map.Entry<Integer,String>entry : sortedpolicy.entrySet())
			System.out.println("key = "+ entry.getKey() +" value = "+ entry.getValue()); 
		
		   
		
		System.out.println();
		
		Test obj = new Test();
		
		obj.addPolicyDetails(sortedpolicy);
		System.out.println();
		
		//obj.searchBasedOnPolicyType(policy);
		System.out.println(obj.searchBasedOnPolicyType(sortedpolicy));
	
		
	     	
	}
	
}

