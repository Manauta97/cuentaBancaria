package cuentaBancaria;

import java.util.Scanner;

public class Menu {

public Menu() {
		
	}
	
	public int pintaMenuPrincipal() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		
		do {
			System.out.println("*****************************************************");
			System.out.println("*** 	1. Ver numero de cuenta completo.         ***");
			System.out.println("*** 	2. Ver el titular de la cuenta.           ***");
			System.out.println("*** 	3. Ver el código de la cuenta.            ***");
			System.out.println("*** 	4. Ver el código de la oficina.           ***");
			System.out.println("*** 	5. Ver el número de la cuenta.            ***");
			System.out.println("*** 	6. Ver dígitos de control de la cuenta.   ***");
			System.out.println("*** 	7. Realizar ingreso.                      ***");
			System.out.println("*** 	8. Retirar efectivo.                      ***");
			System.out.println("*** 	9. Consultar saldo de la cuenta.          ***");
			System.out.println("*** 	10. Salir de la aplicación.               ***");
			System.out.println("*****************************************************");
			opc = leer.nextInt();
			
		} while (opc<1 || opc>10);
		
		return opc;
	}
		
}
