package Clases;

public class Persona {
	
	 //En los atributos de la clase se observa el encapsulamiento
	 private String nombre;
     private String apellido;
	    
        //Variable es lo de this y atributos lo que pasas por parametro     o
	    public Persona(String nombre, String apellido){
	    
	        this.nombre = nombre;
	        this.apellido = apellido;
	    }
	    
	    public String getNombre(){
	        return this.nombre;
	    }
	    
	    public void setNombre(String nombre){
	        this.nombre = nombre;
	    }
	    
	    public String getApellido(){
	        return this.apellido;
	    }
	    public void setApellido(String apellido){
	        this.apellido = apellido;
	    }

}
