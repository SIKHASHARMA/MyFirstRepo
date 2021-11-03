import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String>  pq = new PriorityQueue<String> ();
		pq.add("2");
		pq.add("4");
		System.out.println(pq.peek()+" ");
		//System.out.println(pq);
		System.out.println(pq.offer("1"));
		//System.out.println(pq);
		pq.add("1");
		System.out.println(pq);
		System.out.println(pq.poll()+" ");
		if(pq.remove("2"))
		{ 	
			System.out.println(pq.poll()+" ");		
			System.out.println(pq.poll()+" ,"+pq.peek());	
		}
		
	    
		

	}

}
