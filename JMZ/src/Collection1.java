import java.awt.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collections;

public class Collection1 implements Comparable<Collection1>{
	int empId;
	String empName;
	
	

	public Collection1(int empId, String empName) {
		//super();
		this.empId = empId;
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

  @Override 
	  public String toString() { 
		  return "Collection[empId="+ empId +",empName=" + empName +"]";
		  }
  @Override
	public int compareTo(Collection1 o) {
		// TODO Auto-generated method stub
		//return this.empName.compareTo(o.empName);
	  return this.empId - o.empId;
	}
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		ArrayList<Collection1>  l = new ArrayList<Collection1>();
		l.add(new Collection1(1,"sikha"));
		l.add(new Collection1(23,"suhel"));
		l.add(new Collection1(3,"akash"));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
		
		 }

}
