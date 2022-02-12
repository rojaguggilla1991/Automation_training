package trainingpkg1;

public class PracticeIf {
	
int a = 100;

	public void method(int a) {

		// check the condition
		if (a == 100) {
			System.out.println(a);
		}

		if (a == 150) {
			System.out.println(a);
		}
	
	}

	public static void main(String[] args) {
		
		PracticeIf object = new PracticeIf();
		object.method(100);

	}

}
