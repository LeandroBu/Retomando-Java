package Clases;

import java.time.LocalDate;

public class Persona {

	 private String nombre = "";
     private String apellido = "";
     private LocalDate fechaNacimiento;
     private final Integer dni;
     private char sexo = 'H';
     private Double peso = 0.0;
     private Double altura = 0.0;
	    
	    public Persona(Integer dni) {
		super();
		this.dni = dni;
	}
	    

		public Persona(Integer dni, String nombre, String apellido, char sexo, int año,int mes, int fecha) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = LocalDate.of(año,mes,fecha);
			this.sexo = sexo;
		}


		public Persona(String nombre, String apellido, Integer dni, Double peso, Double altura,int año,int mes, int fecha) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = LocalDate.of(año,mes,fecha);
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
	}

		public Double calcularIMC() {
			Double imc =this.peso/(Math.pow(this.altura, 2));
			if(imc<20) {
				imc = -1.0; 
			}
			if(imc>=20 && imc <=25) {
				imc = 0.0;
			}
			if(imc>25) {
				imc = 1.0;
			}
			return imc;
		}
		
		public Boolean esMayorDeEdad() {
			LocalDate actual = LocalDate.of(2002, 4, 1);
			return this.fechaNacimiento.isBefore(actual);
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}


		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}


		public char getSexo() {
			return sexo;
		}


		public void setSexo(char sexo) {
			this.sexo = sexo;
		}


		public Double getPeso() {
			return peso;
		}


		public void setPeso(Double peso) {
			this.peso = peso;
		}


		public Double getAltura() {
			return altura;
		}


		public void setAltura(Double altura) {
			this.altura = altura;
		}


		public Integer getDni() {
			return dni;
		}
		
		
		
	


}
