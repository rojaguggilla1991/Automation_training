package trainingpkg1;

public class Family extends AbstractClass implements Interface1,Interface2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Family obj = new Family();
obj.abstractmethod1();
obj.abstractmethod2();
obj.abstractmethod3();
obj.chaitu();
obj.roja();
obj.uv();
obj.raju();
obj.rani();
obj.teja();
obj.kandukuri();
	}

	public void roja() {
		// TODO Auto-generated method stub
		System.out.println("roja 1");
	}

	public void chaitu() {
		// TODO Auto-generated method stub
		System.out.println("chaitu 1");
	}

	public void uv() {
		// TODO Auto-generated method stub
		System.out.println("uv 1");
	}

	public void raju() {
		// TODO Auto-generated method stub
		System.out.println("raju 1");
	}

	public void rani() {
		// TODO Auto-generated method stub
		System.out.println("rani 1");
	}

	public void teja() {
		// TODO Auto-generated method stub
		System.out.println("teja 1");
	}

	@Override
	public void abstractmethod1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
	}

	@Override
	public void abstractmethod2() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
	}
	

	@Override
	public void abstractmethod3() {
		// TODO Auto-generated method stub
		System.out.println("method 3");
	}

	public void kandukuri() {
		System.out.println("i m in family");
	}
}
