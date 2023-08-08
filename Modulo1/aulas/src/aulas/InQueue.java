package aulas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class InQueue {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			fila.add(i);
		}
		
		System.out.println(fila);
		
		System.out.println(fila.remove());
		
		System.out.println(fila);
		
		System.out.println(fila.add(11));
		
		System.out.println(fila.peek());
		
		System.out.println(fila.size());
		
		System.out.println(fila.contains(37));
		
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		Iterator<Integer> iFila = fila.iterator();
		
		
		while(iFila.hasNext()) {
			System.out.println(iFila.next());
		}
	}

}
