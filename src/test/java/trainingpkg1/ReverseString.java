package trainingpkg1;

public class ReverseString {
	
		public void reverseStringMethod() {
			
			String name = "malayalam10";
			
			String reverseName = "";
			
			for(int i = name.length()-1;i>=0;i--) {
				
				reverseName = reverseName+name.charAt(i);
				
				
				
			}
			
			if(name.equals(reverseName)) {
				
				System.out.println("reverse of malayalam is "  +reverseName);
				
				
				
			}else {
				
			System.out.println("reverse of malayalam is not "  +reverseName);
			
			}
			
		
			
			}
			
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString obj = new ReverseString();
		
		obj.reverseStringMethod();

	}

}
