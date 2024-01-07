package Control_De_Flujo;
import java.util.*;

public class Un_Segundo_Mas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escribe un programa que pida al usuario la hora en horas minutos y segundos y
		 * muestre esa hora sumándole un segundo. Ejemplo: hora introducida 11 40 59 -->
		 * resultado hora actual más 1 segundo --> 11:41:00
		 */
		
		Scanner Tiempo = new Scanner (System.in);
		
		System.out.println("Introude La Hora:");
		int Hora = Tiempo.nextInt();
		
		
		System.out.println("Introude Los Minutos:");
		int Minutos = Tiempo.nextInt();
		
		
		System.out.println("Introude Los Segundos:");
		int Segundos = Tiempo.nextInt();
		
		
		Tiempo.close();
		
		//	CAMBIO DE HORA
		
		if (Hora >= 1 && Hora <= 23 && Minutos == 59 && Segundos == 59) {
			
			Segundos = 00;
			Minutos = 00;
			Hora++;
			
			System.out.println(" resultado para cambio de hora " + Hora + ":" + Minutos + ":" + Segundos);
		}
		
		// CAMBIO DE SEGUNDOS
		
		else if (Hora >= 1 && Hora <= 23 && Minutos <= 59 && Segundos <= 58) {
			
			Segundos ++;
			
			System.out.println(" resultado hora actual más 1 segundo " + Hora + ":" + Minutos + ":" + Segundos);
		}
		
		// CAMBIO DE MINUTOS
		
		else if (Hora >= 1 && Hora <= 23 && Minutos <= 59 && Segundos == 59) {
			
			Segundos = 00;
			Minutos++;
			
			System.out.println(" resultado para cambio de minutos " + Hora + ":" + Minutos + ":" + Segundos);
		}
	}

}
