package Pruebas;
import java.util.*;

public class String_Inverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner Text = new Scanner(System.in);
		
		System.out.println("Introduce El Texto:");
		String Texto = Text.nextLine();
		
		
		
		String Frase = "";		
		for (int i = Texto.length()-1; i >= 0; i--) {
			
			Frase += Texto.charAt(i);
		}
		
		System.out.println("1 Manera De Realizarlo Con Un For: " + Frase);
		
		
		String Frase2 = "";
		for (int i = 0; i < Texto.length(); i++) {
			
			Frase2 = Texto.charAt(i) + Frase2;
		} 
		
		System.out.println("3 Manera De Realizarlo Con Un For: " + Frase2);
		
		
		String Frase3 = "";
		for (char letra : Texto.toCharArray()) {
			
			Frase3 = letra + Frase3;
		}
		
		System.out.println("3 Manera De Realizarlo Con Un For Each: " + Frase3);
		
		Text.close();
	}

}
