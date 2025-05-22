package Pcak2;

public class ThrowExceptionprog {
	
	public void method(int a, int b)
	{
		
		try {
			System.out.println(a%b);
			throw new NullPointerException("This is nullpointer Exception");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	    
		
	}
	
	public void add(int a1, int b1)
	{
		System.out.println(a1+b1);
	}

	public static void main(String[] args) {
		
		
		ThrowExceptionprog c=new ThrowExceptionprog();
		
		c.method(10, 0);
		
		
		c.add(10, 20);
		

	}

}
