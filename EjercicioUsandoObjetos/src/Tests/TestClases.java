package Tests;

import Clases.Persona;
import Clases.Rectangulo;
import Clases.Password;
import junit.framework.Assert;

import org.junit.*;


    public class TestClases {
//
//	//Ejercicio2
//	@Test
//	public void rectanguloTest() {
//		
//		Rectangulo r1 = new Rectangulo(1.0, 2.0);
//		Assert.assertNotNull(r1);
//		
//		Rectangulo r2 = new Rectangulo(4.0,5.0);
//		Assert.assertNotNull(r2);
//	        
//	    }
//	    
//	    @Test
//	    public void elPerimetroDeUnRectanguloDebeSerLaSumaDeSusLados() {
//	    	
//	    	Rectangulo r3 = new Rectangulo(4.0,2.0);
//	    	Assert.assertEquals(12, r3.calcularPerimetro(),0.0);
//	    	
//	    }
//	    
//	    @Test
//	    public void elAreaDeUnRectanguloDebeSerLaBasePorSuAltura() {
//	    	
//	    	Rectangulo r4 = new Rectangulo(6.0,7.0);
//	    	Assert.assertEquals(42, r4.calcularArea(), 0.0);
//	    	
//	    }
	    
	    //Ejericio5
	    
//	   @Test
//	   public void pesoIdealyMayorEdad() {
//		   Persona p1 = new Persona("Leandro", "Gomez", 40137676, 85.0, 1.71, 1997, 1, 25);
//		   
//		   Assert.assertEquals(1.0, p1.calcularIMC(), 0.0);
//		   Assert.assertTrue(p1.esMayorDeEdad());
//		   
//	   }
	   
	   @Test
	   public void password() {
		   Password p1 = new Password(10,"Manchini88");
		   
		   Assert.assertEquals("Manchini88",p1.getClave());
		   
		   p1.cambiarClave("Leandro123");
		   Assert.assertEquals("Leandro123", p1.getClave());
	   }
	   
  
}
