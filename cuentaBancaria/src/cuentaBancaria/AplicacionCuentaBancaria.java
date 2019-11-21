package cuentaBancaria;

import java.util.Scanner;

public class AplicacionCuentaBancaria {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Menu menu = new Menu();
		String nombre = "";
		String numCuenta = "";
		CuentaBan cuenta;
		
		System.out.println("Nombre del titular de la cuenta");
		nombre = leer.nextLine();
		
		do {
			
			System.out.println("Código de la cuenta del cliente");
			numCuenta = leer.nextLine();
			cuenta = new CuentaBan(nombre, numCuenta);
			
		}while(!cuenta.calcularDigitoControl());
		
		int opc = 0;
		
		do {
			opc = menu.pintaMenuPrincipal();
			
			switch (opc) {
			case 1:
				System.out.println(cuenta.getNumCuenta());
				break;
			case 2:
				System.out.println(cuenta.getNombre()); 
				break;
			case 3:
				System.out.println(cuenta.verCodigoEntidad());
				break;
			case 4:
				System.out.println(cuenta.verCodigoOficina());
				break;
			case 5:
				System.out.println(cuenta.verNumCuenta());
				break;
			case 6:
				cuenta.calcularDigitoControl();
				break;
			case 7:
				System.out.println("ingreso realizado de: "+ cuenta.ingresarDinero()+"€");
				break;
			case 8:
				System.out.println("Has retirardo: "+ cuenta.sacarDinero()+"€ de tu cuenta");
				break;
			case 9:
				System.out.println("Tu saldo es de: "+ cuenta.consultarSaldo()+"€");
				break;
			case 10:
				System.out.println("");
				System.out.println("HAS SALIDO DE LA APLICACIÓN");
				break;
			}
			
		} while (opc != 10);

	}

}
