package trainingpkg1;

public class CoditionalStmtPgm {

	
		int a=150;

	          

	   public void ifStmtMethod(int a) {

	              // check the condition

	              if(a==100) {

	                        

	                         System.out.println("a = 100: "+a);

	              }

	             

	              if(a==150) {

	                         System.out.println("a = 150: "+a);

	              }

	             

	   }

	  

	   public void nestedIfMethod() {

	             

	              // Multiple 'if' conditions....first IF condition satisfies then gos to 2ns IF block etc if not stops before the condition

	              int x = 50;

	              int y = 30;

	             

	              if(x==50) {

	                         if(y==20){

	                                    System.out.println("y=20: "+y);

	                         }

	                         System.out.println("x=50: "+x);

	                        

	              }

	             

	   }

	          

	   public void ifElseMethod(int a) {

	          

	              if(a!=100) {

	                         

	                         System.out.println("a!= 100: "+a);

	              }else{

	                         System.out.println("a=100: "+a);

	                        

	              }

	   }

	   //checking a=300 are not

	   public void ifElseIfMethod(int a) {

	             

	              if(a==200) {

	                        

	                         System.out.println("a=200: "+a);

	                        

	              }else if(a==100) {

	                         System.out.println("a=100:  "+a);

	                     

	                        

	              }else if(a==400) {

	                         System.out.println("a=400:"+a);

	                        

	              }else {

	                         System.out.println("a=300: "+a);

	              }

	   }

	  

	   public void logicalAnd() {

	              int a=70;

	              int b=20;

	              int c=50;

	             

	              //&& (and) ||(or)

	              //a==70 true && b==30 true  ..."if"...true

	              //a==70 true && b==20 false ..."else"...false

	              //a==80 false && b==30 true..."else"...false

	              //a==80 false && b==20 false..."else"...false

	             

	              //a==70 true || b==30 true  ..."if"...true

	              //a==70 true || b==20 false ..."if"...true

	              //a==80 false || b==30 true..."if"...true

	              //a==80 false || b==20 false..."else"...false

	             

	              if(a==70 && b==30 || c==20) {

	                         System.out.println("a= "+a+" b= "+b+" c="+c);

	              }else {

	                         System.out.println("a!= "+a+" b!= "+b+" c!="+c);

	              }

	                        

	   }

	                      //if else if or switch are one and the same

	   public void switchMethod() {

	              int day=1;

	              switch(day) {

	              case 1:

	                         System.out.println("Mon");

	                         break;

	              case 2:

	                         System.out.println("Tue");

	                         break;

	              case 3:

	                         System.out.println("Wed");

	                         break;

	              case 4:

	                         System.out.println("Thu");

	                         break;

	              case 5:

	                         System.out.println("Fri");

	                         break;

	              case 6:

	                         System.out.println("Sat");

	                         break;

	              case 7:

	                         System.out.println("Sun");

	                         break;

	              }

	   }

	   public static void main(String[] args) {

	                      // TODO Auto-generated method stub

	 

		   CoditionalStmtPgm obj =new CoditionalStmtPgm();

	                     

	                      //obj.ifStmtMethod(150);

	//obj.ifStmtMethod(100);

	           //obj.ifStmtMethod(200);

	           //obj.nestedIfMethod();*/

	                      //obj.ifElseIfMethod(200);

	           //obj.ifElseMethod(100);

	                      obj.logicalAnd();

	                      //obj.switchMethod();

	           }

	}

