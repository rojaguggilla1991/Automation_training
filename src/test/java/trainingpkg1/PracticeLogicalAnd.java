package trainingpkg1;

public class PracticeLogicalAnd {

	int a = 10;
	int b = 20;
	int c = 30;
	
	
	public void logicalAndMethod() {
		
	
	
	   if((a==10 && b==20) || c==30) {

           System.out.println("a= "+a+" b= "+b+" c="+c);

	   }else {

           System.out.println("a!= "+a+" b!= "+b+" c!="+c);

}
	}
          	public static void main(String[] args) {
		// TODO Auto-generated method stub

          		PracticeLogicalAnd obj = new PracticeLogicalAnd();
          		obj.logicalAndMethod();
          	
          	}
}


