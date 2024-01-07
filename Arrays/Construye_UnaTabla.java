package Arrays;

public class Construye_UnaTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Construye una tabla de 10 elementos del tipo que desees. Declara 3 variables
		 * de tablas diferentes que referenciarán a la tabla creada. Comprueba
		 * imprimiendo por pantalla que todas la variables contienen la misma referencia
		 */
		
		int Vacas [] = new int [10];
		System.out.println(Vacas);
		
		
		int Perros [] = Vacas;
		System.out.println(Perros);

		
		int Gatos [] = Perros;
		System.out.println(Gatos);

		
		int Tortugas [] = Gatos;
		System.out.println(Tortugas);

	}

}
