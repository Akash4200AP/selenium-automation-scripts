package Pcak2;

public class TryCatchProgram {

	public static void main(String[] args) {
		
		int a=10;
		
		int div;
		try {
			div = a%0;
		} catch (IndexOutOfBoundsException e) {
			
			e.printStackTrace();
			System.out.println("Number cannot be divisible by zero");
		}
		
         catch (NullPointerException e) {
			
			e.printStackTrace();
			System.out.println("Number cannot be divisible by zero");
		}
		
		 catch (ArithmeticException e) {
				
				e.printStackTrace();
				System.out.println("Not divisible by zero");
			}
		finally
		{
			System.out.println("I am always excecute");
			
		}
		
	}

}
