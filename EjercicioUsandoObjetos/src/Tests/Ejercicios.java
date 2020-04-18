package Tests;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicios {
	
	@Test
    public void usandoString() {

        //1.A 
        //Usando el metodo reverse de proba que el string palindromo se lee igual al derecho que al reves
        String palindromo = "anitalavalatina";
        StringBuilder palindromoAlReves = new StringBuilder(palindromo);
        String palindromoinvertido = palindromoAlReves.reverse().toString();
        

        Assert.assertEquals(palindromo, palindromoinvertido);

        //1.B  
        String frase = "Do, or do not. There is no try";
        String contiene = "There";
        String noContiene = "Yoda";

        //Existe un metodo que sirve para que lo siguiente de verde. ¿Cuál es?
        Assert.assertTrue(frase.contains(contiene));
        Assert.assertFalse(frase.contains(noContiene));

        //1.C 
        //E String indiana tiene 18 posiciones, con que metodo podes comprobarlo?
        String indiana = "Henry Jones Junior";
        Assert.assertEquals(18, indiana.length());

        //Comproba que 6 es la posicion de la primer i
        // No es en la posicion 5
        String palabra = "Otorrinolaringólogo";
        StringBuilder busqueda = new StringBuilder(palabra);
        Assert.assertEquals(5, busqueda.indexOf("i"));
        
        
      
        // Y que 12 es de la segunda
        // Tampoco es 11
        Assert.assertEquals(11, busqueda.lastIndexOf("i"));
    }
	//probando, otra vez, y una vez mas

}
