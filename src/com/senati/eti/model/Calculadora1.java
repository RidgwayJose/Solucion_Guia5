package com.senati.eti.model;

public class Calculadora1 {
	//Atributos
	private float numero1;
	private float numero2;
	
	// Definir m�todos Getters y Setters
	// Get: Obtener el valor del atributo
	// Set: Definir el valor para el atributo
	
	// Funci�n     -> Ejecutar un bloque de c�digo
	public float getNumero1() {
		return this.numero1;
	}
	public void setNumero1(float num1) {
		this.numero1 = num1;
	}
	public float getNumero2() {
		return this.numero2;
	}
	public  void setNumero2(float num2) {
		this.numero2 = num2;
	}
	
	//Definir los Constructores
	//Constructor: Permite iniciar los valores 
	
	//Constructor vac�o
	public Calculadora1() {
	
	}
	
	//Constructor con par�metros de entreda
	public Calculadora1(float num1, float num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}
	
	// M�todos Personalizados
	public float Suma () {
		return this.numero1 + this.numero2;
	}
	
	public float Resta () {
		return this.numero1 - this.numero2;
	}
	public float Producto () {
		return this.numero1 * this.numero2;
	}
	public float Division () {
		float r = 0;
		if (this.numero2 != 0) 
			r =this.numero1 / this.numero2;
		
		return r;
		}
		
	public float RestoEntero () {
		float r = 0;
		if (this.numero2 != 0)
			r = this.numero1 % this.numero2;
		
		return r;
	}
	
	
	
}
