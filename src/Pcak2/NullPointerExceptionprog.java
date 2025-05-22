package Pcak2;

public class NullPointerExceptionprog {

	public static void main(String[] args) {
		
		String str=null;
		try {
			
			System.out.println(str.length());
			
		} catch (Exception e) {
			
			e.printStackTrace();
			String str1="Akash";
			System.out.println(str1.length());
		}
		

	}

}
