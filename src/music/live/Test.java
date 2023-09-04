package music.live;

import music.Playable;
import music.string.Venna;
import music.wind.saxophone;

public class Test {

	public static void main(String[] args) {
		Venna obj1 = new Venna ();
		saxophone obj2 = new saxophone ();
		
		obj1.play();
		obj2.play();
		
		Playable a = obj1;
		Playable b = obj2;
		
		System.out.println();
	
		
		((Venna) a).play();
	    ((saxophone) b).play();
		
		

	}

}
