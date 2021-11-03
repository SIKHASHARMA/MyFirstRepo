import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	
	
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(10);
		q1.add(20);
		q1.add(60);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(100);
		q1.offer(1);
		System.out.println(q1);

	}

}
