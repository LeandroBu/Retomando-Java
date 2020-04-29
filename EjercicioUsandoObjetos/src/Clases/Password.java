package Clases;

public class Password {
	
	Integer longitud = 8;
	String clave;
	
	public Password() {
		super();
	}

	public Password(Integer longitud, String clave) {
		super();
		this.longitud = longitud;
	    this.clave = clave;
		
	
	}
	
	public void cambiarClave(String clave) {
		if(clave.length()==this.longitud) {
			System.out.println("si");
			if(clave.matches("[a-z].*[A-Z]{2,}\\d{5,}"));
			System.out.println("si");
			this.clave = clave;
		}
	}

	public Integer getLongitud() {
		return longitud;
	}

	public String getClave() {
		return clave;
	}
	
	public static void main(String[] args) {
		Password p1 = new Password(10,"Manchini88");
		System.out.println(p1.getClave());
		 p1.cambiarClave("Leandro123");
		 System.out.println(p1.getClave());
	}

}
