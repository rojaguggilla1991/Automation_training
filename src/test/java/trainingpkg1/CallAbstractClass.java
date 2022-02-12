package trainingpkg1;


//chaitanya characteristics
public class CallAbstractClass extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CallAbstractClass obj = new CallAbstractClass();
obj.abstractmethod1();
obj.abstractmethod2();
obj.abstractmethod3();
obj.normalMethod();
obj.normalMethod1();
obj.normalMethodName();

	}

	@Override
	public void abstractmethod1() {
		// TODO Auto-generated method stub
		System.out.println("i m in abstractmethod1");
		
	}

	@Override
	public void abstractmethod2() {
		// TODO Auto-generated method stub
		System.out.println("i m in abstractmethod2");
			
	}

	@Override
	public void abstractmethod3() {
		// TODO Auto-generated method stub
		System.out.println("i m in abstractmethod3");
		
	}
 public void normalMethodName() {
	 System.out.println("i m in call abstract class normal method name");
 }
}
