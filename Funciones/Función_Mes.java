package Funciones;
import java.util.*;

public class Función_Mes {
	
	static boolean Calendario (int dia, int mes, int año) {
		
	       boolean Fecha = false;
	       
	       Scanner entrada=new Scanner(System.in);
	       
	       System.out.println("Introduce día en número");
	       dia = entrada.nextInt();

	       System.out.println("Introduce mes en número");
	       mes = entrada.nextInt();

	       System.out.println("Introduce año en número");
	       año = entrada.nextInt();
	       
	       entrada.close();
	       
	       if (año == 0) {//comprobamos el año        
	           Fecha = false;
	       }

	       else if ((mes == 2)&&(dia > 0)&&(dia < 29)){//comprobamos febrero
	           Fecha = true;
	       }

	       else if (((mes == 9)||(mes == 4)||(mes == 6)||(mes ==11))&&((dia > 0)&&(dia < 31))){//Comprobamos
	           //los meses que tienen 30 días
	           Fecha = true;
	       }

	       else if (((mes == 1)||(mes == 3)||(mes == 5)||(mes == 7)||(mes == 8)

	               ||(mes == 12)||(mes == 10))&&(dia > 0)&&(dia < 32)) {//Comprobamos los meses que tienen 31 días

	           Fecha = true;
	       }
	       else {
	           Fecha = false;
	       }
	       if (Fecha == true) {
	           System.out.println("Fecha correcta");
	       }
	       else {
	           System.out.println("Fecha incorrecta");
	       }
	       
	       return (Fecha);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       // TODO Auto-generated method stub

	       //Pedir día, mes y año e indicar si la fecha es correcta.

	       //Tener en cuenta que hay meses con 28, 30 y 31 días
		
		int Dia = 0; int Mes = 0; int Año = 0;
		
		Calendario(Dia, Mes, Año);
	}

}
