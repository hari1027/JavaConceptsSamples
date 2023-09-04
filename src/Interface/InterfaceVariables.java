package Interface;

interface Football
{
	int NoOfPlayers = 11; 
	int NoOfSub=5;
	
}

class Match implements Football
{
	public void match()
	{
		int NoOfplayers = Football.NoOfPlayers + 3;
		
		
		System.out.println("subs=" + NoOfSub);
		System.out.println(NoOfplayers);
		
	}
}

public class InterfaceVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Match obj = new Match();
		obj.match();

	}

}
