package trainingpkg1;

public class RemoveWhiteSpaces {
	
	public void removeWhiteSpacesMethod() {
		
		
		String name = "i like red colour";
		
		String array = name.replace(" ","");
		
		String array1 = name.replace("e","E");
		
		System.out.println(array);
		System.out.println(array1);
	}
	
	public void wordsLength() {
		
		String name = "  i have a kid  ";
		
		String [] words_length = name.split("  ");
		
		System.out.println(words_length.length);
	}

	public static void main(String[] args) {
		
		RemoveWhiteSpaces obj = new RemoveWhiteSpaces();
		
		obj.removeWhiteSpacesMethod();
		// TODO Auto-generated method stub
		
		obj.wordsLength();

	}

}
