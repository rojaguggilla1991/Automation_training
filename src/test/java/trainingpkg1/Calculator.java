package trainingpkg1;

public class Calculator  {
	int a =1;
	int b =2;
	int c =3;
	int d =4;

	public void additionMethod() {
    System.out.println("i m in addition method");
}
	public void subtractionMethod() {
    System.out.println("i m in subtraction method");

}
	public void multiplicationMethod() {
	System.out.println("i m in multiplication method");

}
	public void divisionMethod() {
	System.out.println("i m in division method");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Calculator obj = new Calculator();

		obj.additionMethod();
		obj.subtractionMethod();
		obj.divisionMethod();
		obj.multiplicationMethod();

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);






	}
}