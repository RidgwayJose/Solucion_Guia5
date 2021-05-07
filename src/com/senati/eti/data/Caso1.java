package com.senati.eti.data;

import java.util.Scanner;
import com.senati.eti.model.Calculadora1;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Instancia: Crear un objeto a partir de una clase
		Calculadora1 objCalc = new Calculadora1();
		
		float n1 = 0, n2 = 0;
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("------------------");
		System.out.print("Numero 1: ");
		n1 = sc.nextFloat();
		System.out.print("Numero 2: ");
		n2 = sc.nextFloat();
		
		objCalc.setNumero1(n1);
		objCalc.setNumero2(n2);
		
		System.out.println("\nR E S U L T A D O S");
		System.out.println("-------------------");
		System.out.println("1. Suma............: " + objCalc.Suma());
		System.out.println("1. Resta...........: " + objCalc.Resta());
		System.out.println("1. Producto........: " + objCalc.Producto());
		if(objCalc.getNumero2() != 0) {
			System.out.println("1. División........: " + objCalc.Division());
			System.out.println("1. Resto Entero....: " + objCalc.RestoEntero());
		}else {
			System.out.println("1. División........: No es posible");
			System.out.println("1. Resto Entero....: No es posible");
		}
	}

}
