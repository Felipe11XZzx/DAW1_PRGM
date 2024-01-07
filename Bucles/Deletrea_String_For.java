package Bucles;

public class Deletrea_String_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String Goat = "ELADIO / CARRIÓN";
		
		char Palabra = Goat.charAt(0);
				
		for (int i = Goat.length() - 1; i >= 0; i--) {
			
			Palabra = Goat.charAt(i);
			
			System.out.println(Palabra);
		}
	}

}
