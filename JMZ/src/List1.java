import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList  l=new ArrayList();
l.add("sahil");
l.add(10);
l.add("100");
System.out.println(l);
l.remove(1);//pass argument
System.out.println(l);
	

	l.forEach(new Consumer<Object>( ) {
		public void accept(Object o) {
			System.out.println(o);
		}
	});
	
	l.forEach((Object o) -> System.out.println(o));
	l.forEach(( o) -> System.out.println(o));

	l.forEach( o -> System.out.println(o));
	
	Set s =new HashSet();//unordered
	s.add(10);
	s.add("20");
	s.add(true);
	s.add('t');	
	System.out.println(s);
	System.out.println("------------------------------------");
	
	Set s1=new LinkedHashSet(); //ordered
	s1.add(100);
	s1.add("20");
	s1.add(true);
	s1.add('t');
	System.out.println(s1);
	System.out.println("------------------------------------");
	
	LinkedList ll=new LinkedList();
	ll.add("hello");
	ll.add("10001");
	ll.add("okay");
	System.out.println(ll);
	System.out.println("------------------------------------");
	
	List lal=new ArrayList(); //capital then small
	System.out.println("------------------------------------");
	lal.add("12345");
	lal.add("512345");
	//lal.add(123); 
//	lal.add(true);  only string value will get sorted
	Collections.sort(lal);
	System.out.println(lal);
	System.out.println("------------------------------------");
	
	Vector v=new Vector();//same as arraylist
	v.add("hello");
	v.add("10001");
	v.add("okay");
	System.out.println(v);
	System.out.println("------------------------------------");
	
	TreeSet t=new TreeSet(); //sorted in ascending order
	t.add(10);
	t.add(12);
	t.add(23);
	//t.add("suresh");
	//t.add("ramesh");
	//t.add("danish");
	System.out.println(t);
	System.out.println(t.ceiling(20));//it will lowest nearest value or same or null
	//System.out.println(t.pollFirst()); //remove from the list den print it
	//System.out.println(t.pollLast());
	System.out.println(t);
	//System.out.println(t.first()); //doesnt remove the value from list and display
	
	String[] str= {"one","two","three","four"};
	List  list=Arrays.asList(str); //utility-static() only [convert array to list]
	list.set(1, "one");
	System.out.println(list);
	str[0]="zero";
	for(String sik:str) {
		System.out.println(list);
		
	}
	System.out.println("------------------------------------");
	System.out.println(list);//returntype-list
	
	Map m=new HashMap();
	m.put("1","one" );
	m.put("2",20);
	System.out.println(m);
	System.out.println("------------------------------------");
	//m.put(null, "10k");
	//m.put(null, "null");
	//m.put("null", null);
	m.put("2",200);
	//m.put(null, null);
	m.put("3",230000);
	System.out.println(m);
	
	Iterator i=m.entrySet().iterator(); //entryset is a anonymous class
	while(i.hasNext()) {
		System.out.println(i.next());
		System.out.println("-------------------------------------------------");
		
		
	HashMap<Object,Object> hm=new HashMap<Object,Object>(); //unorder 
	hm.put(1, "one");
	hm.put(2, "two");//replace by 2-four value bcoz of same key value
	hm.put(3, "twoo");
	hm.put(2, "four");
	hm.put(4, "four");
	hm.put(null, "null");
	hm.put(null, null);
	System.out.println(hm);
	System.out.println("---------------------------------------------------");
		
		for(Map.Entry<Object, Object> map:hm.entrySet())
		{
			System.out.println(map.getKey());
			System.out.println(map.getKey());
		}
		
	}
	
	
	
	
	}

	
		
	}
