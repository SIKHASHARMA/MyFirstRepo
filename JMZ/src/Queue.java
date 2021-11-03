
public class Queue {
	
	int queue []=new int[5];
	int size;
	int front;
	int rear;
	
	 public void enqueue(int data)
	 {
		 queue[rear]=data;
		 rear=rear +1;
		 size=size+1;
	 }
	 
	 public void show()
	 {
		 for(int i=0;i<size;i++)
		 {
			 System.out.println("elements :  ");
			 System.out.println(queue[i]+"  ");
		 }
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Queue q=new Queue();
 q.enqueue(5);
 q.enqueue(2);
 q.show();
 
 
 System.out.println(q);
 
	}

}
