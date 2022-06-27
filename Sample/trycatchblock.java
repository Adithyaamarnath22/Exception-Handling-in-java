package Sample;

public class trycatchblock {

	public static void main(String args[]) {
		
		
	//ArithematicException
		try {
			int divideByZero=5/0;
			System.out.println("Rest of code in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithematicException=>"+e.getMessage());
		}
		System.out.println("hello java");
		
		
		
		
		
		
		
		
	//NumberFormatException	
		String str="Hello";
		try
		{
			int a=Integer.parseInt(str);
			System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception.!"+e.getMessage());
		}
	
	
	
	
	
	
	//NullPointerException
	    String n=null;
	    try {
	    	System.out.println(n.length());
	    }
	    catch(NullPointerException e)
	    {
	    	System.out.println("Null Pointer Exception..!");
	    }
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
  //ArrayIndexBoundException
	    int a[]=new int[5];
	    try {
	    	a[3]=20;
	    	System.out.println(a[3]);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("ArrayIndexOutOfBoundsException..!");
	    }
	    finally {
	    	System.out.println("Im Finally Block Code");
	    }
	}
	
}
