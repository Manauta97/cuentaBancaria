package cuentaBancaria;

import java.util.Scanner;

public class AplicacionCuentaBancaria {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Menu menu = new Menu();
		
		String nombre = "";
		
		
		
		int opc = 0;
		
		do {
			opc = menu.pintaMenuPrincipal();
			
			switch (opc) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				System.out.println("");
				System.out.println("HAS SALIDO DE LA APLICACIÓN");
				break;
			}
			
		} while (opc != 10);

	}

}
