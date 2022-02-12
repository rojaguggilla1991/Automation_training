package trainingpkg1;

public class ReverseNumber {
	
	public void reverseMethod() {
		
		int num =123456789;
		
		int reverseNum = 0;
		
		int r = num;
		
		while(num!=0) {
			
					
			reverseNum =reverseNum*10;
				
			
			reverseNum =reverseNum+num%10;
				
			
			num = num/10;
		
						
			
		}
		
		System.out.println("reverse number of " + r + " is  " +  reverseNum);
		
		if(r == reverseNum) {
			
			
		System.out.println("it is a palindrome number");
			
		} else {
			
			
		System.out.println("it is not a palindrome number");
		
		}
		
	}

	public static void main(String[] args) {
		
      ReverseNumber obj = new ReverseNumber();
      obj.reverseMethod();
	}

}
