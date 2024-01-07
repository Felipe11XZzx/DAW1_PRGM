package Control_De_Flujo;

public class Funcion_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       /*
	        * Desarrolla un programita que dirija a la gente en el supermercado en función
	        * de los objetos que llevan en el carro:
	        *
	        * Hay una cámara que detecta los objetos y dirige a la gente a su caja:
	        *
	        * A los que llevan menos de 10 objetos el ordenador los manda a las cajas de
	        * autopago y una vez allí si llevan menos de 3 a las cajas 1 y 2.
	        *
	        * A los que llevan el carro mediano con más de 10 objetos van a las cajas 10 y
	        * 11 y a los que llevan carro grande a las cajas 12 y 14.
	        *
	        * En el super hay una sola fila con una pantalla que va mostrando mensajes
	        * según van llegando los carros para redirigirlos
	        */
	
	       boolean CarroGrande = true;
	       
	       int Objetos = (int) (Math.random() * 100 + 1);
	       
	       if ((Objetos % 2) == 0) {
	    	   
	           CarroGrande = true;
	       }
	       
	       else {
	           CarroGrande = false;
	       }
	       
	       RegulaClientes(Objetos, CarroGrande);


	   }
	
	static void RegulaClientes (int Objetos, boolean CarroGrande) {
		
		
		if (Objetos > 3 && Objetos <= 10) {
			
			System.out.println("Pase Por Las Cajas De Autopago Por Favor.");
		}
		
		else if (Objetos < 3) {
			
			System.out.println("Por Favor Pase Por Las Cajas 1 Y 2.");
		}
		

		if (Objetos > 10 && CarroGrande == true) {
			
			System.out.println("Carro Grande Pase Por Favor Por Las Cajas 12 Y 14");
		}
		
		if (Objetos > 10 && CarroGrande == false) {
			
			System.out.println("Carro Mediano Pase Por Las Cajas 10 Y 11.");
		}
		
	}
}