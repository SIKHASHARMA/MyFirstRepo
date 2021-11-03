abstract class A{
	abstract void A();
	void b() {
		System.out.println("abstract class b");
	}
	
}
class B extends A{

	@Override
	void A() {
System.out.println("child class A");		
	}
	
}
public class AbstractClassDemo {
public static void main(String[] args) {
	B b=new B();
	b.A();
	b.b();
	A a=new A() {

		@Override
		void A() {
System.out.println("annonymous class");		//cannot create object for abstract class so we use annonymous class	
		}};
		a.A();
}
}
