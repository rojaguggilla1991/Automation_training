package trainingpkg1;

import java.util.ArrayList;

public class RegexPgm {
	
		public void RegexMethod() {
			
			String roja = "3$4%561wdgyufb2e!@#";
			
			ArrayList chars = new ArrayList();
			ArrayList num   = new ArrayList();
			ArrayList even  = new ArrayList();
			ArrayList odd   = new ArrayList();
			ArrayList specialchar = new ArrayList();
			
			for(int i=0;i<roja.length();i++)	{
			if(Character.isAlphabetic(roja.charAt(i))) {
				chars.add(roja.charAt(i));
				
				
			}else if(Character.isDigit(roja.charAt(i))) {
				
			num.add(roja.charAt(i));
			
		} else {
			specialchar.add(roja.charAt(i));
			
		}
}
			System.out.println(chars);
			System.out.println(num);
			System.out.println(specialchar);
			
			for(int j = 0; j<num.size();j++) {
				
				int number = Integer.parseInt(num.get(j).toString());
				if( number%2 == 0) {
					
					even.add(number);
					
				}else {
					odd.add(number);
					
				}
			}
			
		}

	public static void main(String[] args) {
		
		RegexPgm obj = new RegexPgm();
		obj.RegexMethod();
		
	}
		

	}
