import java.util.TreeSet;

public class SubTree {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts= new TreeSet<String>();
		TreeSet<String> subTree= new TreeSet<String>();
		ts.add("a"); //ts=5
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
		System.out.println(ts);
		
		subTree =(TreeSet<String>) ts.subSet("b", true,"d",true); //whatever comes between" b "and "d" including "b" and "d" (range i.i. c only)bcoz of true value
		ts.add("g");
		ts.pollFirst(); //remove from ts
		ts.pollFirst();
		ts.add("c1");// comes between the range, like c1,c2 .....only not go,in(not accept)
		System.out.println(ts.size());
		System.out.println(subTree.size()); 
		
		
		
		

	}

}
