package trainingpkg1;

public class ReverseEachWord {

	public void reverseEachWordMethod() {

		String s = "Java J2E Java JSP J2EE";

		String[] splitString = s.split(" ");

		String reverseString = "";

		for (int i = 0; i < splitString.length; i++) {

			String reverseWord = "";

			String eachWord = splitString[i];

			for (int j = eachWord.length() - 1; j >= 0; j--) {

				reverseWord = reverseWord + eachWord.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";

		}

		System.out.println(reverseString);

	}

	public static void main(String[] args) {

		ReverseEachWord obj = new ReverseEachWord();

		obj.reverseEachWordMethod();
	}

}
