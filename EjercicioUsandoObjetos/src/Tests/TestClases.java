package Tests;

import Clases.Rectangulo;
import junit.framework.Assert;

import org.junit.*;


public class TestClases {

	//Ejercicio2
	@Test
	public void rectanguloTest() {
		
		Rectangulo r1 = new Rectangulo(1.0, 2.0);
		Assert.assertNotNull(r1);
		
		Rectangulo r2 = new Rectangulo(4.0,5.0);
		Assert.assertNotNull(r2);
	        
	    }
	    
	    @Test
	    public void elPerimetroDeUnRectanguloDebeSerLaSumaDeSusLados() {
	    	
	    	Rectangulo r3 = new Rectangulo(4.0,2.0);
	    	Assert.assertEquals(12, r3.calcularPerimetro(),0.0);
	    	
	    }
	    
	    @Test
	    public void elAreaDeUnRectanguloDebeSerLaBasePorSuAltura() {
	    	
	    	Rectangulo r4 = new Rectangulo(6.0,7.0);
	    	Assert.assertEquals(42, r4.calcularArea(), 0.0);
	    	
	    }
  
}
