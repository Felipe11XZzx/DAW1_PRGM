package Pruebas;
import java.util.*;

public class Array_Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Meses [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		Scanner Dia = new Scanner (System.in);
		
		System.out.println("Introduce El Numero Del Mes:");
		int mes = Dia.nextInt();
		
		Dia.close();
		
		if (mes >= 1 && mes <= 12) {
			
			System.out.println("El Nombre Corresponediente Del Mes Es: " + Meses [mes - 1] );
		}
		
		else {
			
			System.out.println("Mes Invalido O Equivocado");
		}
	}

}
