package trainingpkg1;

public class SwapStringsWithoutThirdParameter {
	
	String S = "roja";
	String S1 = "teja";
	
	 
	public void swapMethod() {
		
		S = S+S1;
		System.out.println(S);
		S1 = S.substring(0,S.length()-S1.length());
		S =  S.substring(S1.length(),S.length());
		
		
		
		System.out.println(S);
		System.out.println(S1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapStringsWithoutThirdParameter obj = new SwapStringsWithoutThirdParameter();
		
		obj.swapMethod();

	}

}
