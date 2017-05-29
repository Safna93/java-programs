public abstract class AbstractClass_Ex1 {
 
	abstract void function1();
	
	void function2() {
		
		System.out.println("Function - 2");
	}
}
 
class SubClass extends AbstractClass_Ex1 {
 
	@Override
	void function1() {
		
		System.out.println("Function - 1");
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		SubClass obj = new SubClass();
		
		obj.function1();
		obj.function2();
	}
}