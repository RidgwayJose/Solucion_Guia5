package com.senati.eti.data;

import com.senati.eti.model.Calculadora2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat dec = new DecimalFormat("0.##");
		
		float n1 = 0, n2 = 0;
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("------------------");
		System.out.print("Numero 1: ");
		n1 = sc.nextFloat();
		System.out.print("Numero 2: ");
		n2 = sc.nextFloat();
		
		Calculadora2 objCalc = new Calculadora2 (n1, n2);
		
		System.out.println("\nR E S U L T A D O S");
		System.out.println("---------------------");
		System.out.println("1.  Suma..................: " + objCalc.Calcular(1));
		System.out.println("2.  Resta.................: " + objCalc.Calcular(2));
		System.out.println("3.  Producto..............: " + objCalc.Calcular(3));
		if(objCalc.getNumero2() != 0) {
			System.out.println("4.  División..............: " + objCalc.Calcular(4));
			System.out.println("5.  Resto Entero..........: " + objCalc.Calcular(5));
		}else {
			System.out.println("4.  División........: No es posible");
			System.out.println("5.  Resto Entero....: No es posible");
		}
		System.out.println("6.  Promedio..............: " + objCalc.Calcular(6));
		System.out.println("7.  Suma de cuadrados.....: " + objCalc.Calcular(7));
		System.out.println("8.  Diferencia Porcentual.: " + dec.format(objCalc.Calcular(8)) + "%");
		System.out.println("9.  Mayor.................: " + objCalc.Calcular(9));
		System.out.println("10. Menor.................: " + objCalc.Calcular(10));

	}
}