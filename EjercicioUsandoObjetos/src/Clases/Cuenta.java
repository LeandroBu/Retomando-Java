package Clases;

public class Cuenta extends Persona{
//ejercicio 4
	private Double saldo;
	Persona persona;
    
    
	public Cuenta(String nombre, String apellido, Double saldo, Persona persona) {
		super(nombre, apellido);
		this.saldo = saldo;
		this.persona = persona;
	}


	public Cuenta(String nombre, String apellido,Double saldo) {
		super(nombre, apellido);
		this.saldo = saldo;
		this.persona = new Persona(nombre,apellido);
	}
	
	public void depositar(Double cantidad) {
		if(cantidad>0) {
			this.saldo += cantidad;
		}
	
	
	}
	public void retirar(Double retirar) {
		if(retirar<this.saldo) {
			this.saldo-=retirar;
		}
	}
	//Los setters son innecesario
	
}
