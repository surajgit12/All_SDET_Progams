package JavaBasicPrograms;

import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.offer(2);
		q.offer(new Integer(1));
		q.offer(3);
		
		
		while(!q.isEmpty()) {
			System.out.println(q+ "");
		}
	}

}
