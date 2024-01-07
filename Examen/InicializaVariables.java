package Examen;

public class InicializaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a, b, c;
		
		a = 0;
		b = 3;
		c = 3;
		
		do {
			
			if (a == 0) {
				
				System.out.println("if_1");
				a++;
			}
			
			else {
				System.out.println("else_1");
				}
			
			for (int aux = 1; aux < c; aux++) {
				
				a++;
			} 
			
			a++;
			
		} while(b > 4);
		
		
		if (a == 4) {
			
			System.out.println("a= " + a);
		}
	}

}
