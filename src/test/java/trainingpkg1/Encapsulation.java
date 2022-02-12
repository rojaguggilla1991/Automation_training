package trainingpkg1;

public class Encapsulation extends PrivateAccessEncapsulation {
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Encapsulation obj = new Encapsulation();
	    
	  obj.setA(1);
	  obj.setD(1.0);
	  obj.setName("roja");
	  
	  System.out.println(obj.getA());
	  System.out.println(obj.getD());
	  System.out.println(obj.getName());  
	 
	  
	  obj.setA(2);
	  obj.setD(2.0);
	  obj.setName("chaitu");
	  
	  System.out.println(obj.getA());
	  System.out.println(obj.getD());
	  System.out.println(obj.getName()); 
	}

}
