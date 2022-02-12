
public class StringVowels {

	
	public void vowelMethod(String noun) {
		
	
	
	
		if(noun.equalsIgnoreCase("A")) {
			
			System.out.println("A=A");
			
			
			
			}else if(noun.equalsIgnoreCase("E")) {
				
				System.out.println("E=E");
				
				
				
			}else if(noun.equalsIgnoreCase("I")) {
				
				System.out.println("I=I");
				
				
				
			}else if(noun.equalsIgnoreCase("O")) {
				
				System.out.println("O=O");
				
				
				
			}else if(noun.equalsIgnoreCase("U")) {
				
				System.out.println("U=U");
				
				
				
			}else {
				
				System.out.println("CONSONENTS");
			}	
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringVowels obj = new StringVowels();
		obj.vowelMethod("R");
	}
	


	}
