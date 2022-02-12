package trainingpkg1;

public class CharCount {
	
	public void charCount() {

		String name="i love designing";

		int count=0;

		for (int i=0; i<name.length();i++) {

		if(name.charAt(i)=='i') {

		count=count+1;

		}
		}

		System.out.println(count);
		
		}
		

		public static void main(String[] args) {
			
				CharCount obj = new CharCount();
				obj.charCount();
}
	}
