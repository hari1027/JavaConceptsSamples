package Collections;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue(); // allows only single type of data type .
		p.add("hari");
		p.add("war");
		p.add("anbu");
		//p.add(12);(it will show error)
		System.out.println(p);
		
		PriorityQueue<String> l = new PriorityQueue<String>();
		l.add("apple");
		l.add("banana");
		l.add("watermelon");
		System.out.println(l);
		
		PriorityQueue<Character> x = new PriorityQueue<Character>();
		x.add('h');
		x.add('a');
		x.add('r');
		x.add('i');
		System.out.println(x);
		
		PriorityQueue y = new PriorityQueue();
		y.add(4);
		y.add(0);//zero is also allowed .
		y.add(2);
		y.add(-3);// negative value will also allowed .
		System.out.println(y);
		
		int num1 = (int) y.peek(); //the first output of the set is the head of the queue.
		System.out.println("The head of the Queue is :" + num1);
		
		System.out.println(x.remove('h'));// (true if it is yes else false)
		
		int num2 = (int) y.poll();// removes the head of the set .
		System.out.println(num2);
		num2 = (int) y.peek();
		System.out.println("The head of Queue is :" +num2);
		
		

	}

}
