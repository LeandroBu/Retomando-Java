package Clases;

public class Cuenta{
//ejercicio 4
	private Double saldo;
	private String titular;
	
	public Cuenta(Double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
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
