package cuentaBancaria;

import java.util.Scanner;

public class CuentaBan {
	private String nombre;
	private String numCuenta;
	private double saldo;

	public CuentaBan() {
		nombre = "";
		numCuenta = "";	
		saldo = 0;
	}
	
	public CuentaBan(String nombre, String numCuenta) {
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.saldo=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public String verCodigoEntidad() {
		
		return this.numCuenta.substring(0, 4);
	}
	public String verCodigoOficina() {
	
		return this.numCuenta.substring(4, 8);
	}
	public String verNumCuenta() {
		
		return this.numCuenta.substring(8, 18);
	}
	
	public boolean calcularDigitoControl() {
		int num1 = 0, num2 = 0, num3 =0;
		int digControl=0, digControl1=0, digControl2=0;
 
		num1 += (Integer.parseInt(numCuenta.substring(0, 1)))*4;
		num1 += (Integer.parseInt(numCuenta.substring(1, 2)))*8;
		num1 += (Integer.parseInt(numCuenta.substring(2, 3)))*5;
		num1 += (Integer.parseInt(numCuenta.substring(3, 4)))*10;
		
		num1 += (Integer.parseInt(numCuenta.substring(4, 5)))*9;
		num1 += (Integer.parseInt(numCuenta.substring(5, 6)))*7;
		num1 += (Integer.parseInt(numCuenta.substring(6, 7)))*3;
		num1 += (Integer.parseInt(numCuenta.substring(7, 8)))*6;
		
		digControl1 = 11-(num1%11);
		
		if (digControl1==10) {
			digControl1=1;
		} 
		if (digControl1 ==11) {
			digControl1=0;
		}
		
		num3 += (Integer.parseInt(numCuenta.substring(10, 11)))*1;
		num3 += (Integer.parseInt(numCuenta.substring(11, 12)))*2;
		num3 += (Integer.parseInt(numCuenta.substring(12, 13)))*4;
		num3 += (Integer.parseInt(numCuenta.substring(13, 14)))*8;
		num3 += (Integer.parseInt(numCuenta.substring(14, 15)))*5;
		num3 += (Integer.parseInt(numCuenta.substring(15, 16)))*10;
		num3 += (Integer.parseInt(numCuenta.substring(16, 17)))*9;
		num3 += (Integer.parseInt(numCuenta.substring(17, 18)))*7;
		num3 += (Integer.parseInt(numCuenta.substring(18, 19)))*3;
		num3 += (Integer.parseInt(numCuenta.substring(19, 20)))*6;
		
		digControl2 = 11-(num3%11);
		
		if (digControl2==10) {
			digControl2=1;
		} if (digControl2 ==11) {
			digControl2=0;
		}
			
		String aux = Integer.toString(digControl1) + Integer.toString(digControl2);
		
		if (this.numCuenta.substring(8, 10).equals(aux)) {
			System.out.println("NUMERO DE CUENTA VALIDO");
			System.out.println(this.numCuenta.substring(8,10));
			return true;
		} else {
			System.out.println("Nº de cuenta incorrecto, vuelve a introducirlo");
			return false;
		}
		
	}
	
	public double ingresarDinero() {
		
		Scanner leer = new Scanner(System.in);
		double ingreso = 0;
		
		System.out.println("Cuanto dinero quieres ingresar");
		ingreso = leer.nextDouble();
		if (ingreso<=0) {
			do {
				System.out.println("Dime una cantidad a ingresar correcta");
				ingreso = leer.nextDouble();
			} while (ingreso<=0);
		}
		this.saldo += ingreso;
		return ingreso;
	}
	
	public double sacarDinero() {
		Scanner leer = new Scanner(System.in);
		double retirar = 0;
		
		System.out.println("Cuanto dinero quires retirar de tu cuenta");
		retirar = leer.nextDouble();
		
		if (retirar>=this.saldo) {
			do {
				System.out.println("NO DISPONES DE TANTO DINERO EN TU CUENTA, consulta tu saldo y retire una cantidad correcta");
				retirar= leer.nextDouble();
			} while (this.saldo>=0);
		}
		this.saldo-= retirar;
		return retirar;
	}
	
	public double consultarSaldo() {
		
		return this.saldo;
	}
}