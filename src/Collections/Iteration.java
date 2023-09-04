package Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Iteration {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
           v.add("a");
           v.add("b");
           v.add("c");
           v.add("d");
           
           System.out.println("using adavanced for loop");
           for(String str:v)
           {
        	   System.out.println(str);
           }
           
           System.out.println("using for each");
           v.forEach (p -> System.out.println (p));
           
           System.out.println("using basic for loop");
           for(int i=0;i<v.size();i++)
           {
        	   System.out.println(v.get(i));
           }
           
           System.out.println("using iterator");
           Iterator<String>itr=v.iterator();
           while(itr.hasNext())
           {
        	   System.out.println(itr.next());
           }
           
           System.out.println("using list iterator in forward direction");
           ListIterator<String> itrs=v.listIterator();
           while(itrs.hasNext())
           {
        	   System.out.println(itrs.next());
           }
           
           System.out.println("using list iterator in backward direction");
           while(itrs.hasPrevious())
           {
        	   System.out.println(itrs.previous());
           }
               
           
	}

}
