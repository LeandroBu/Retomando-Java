package Tests;

import java.util.LinkedList;

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

	 @Test
	 public void recorriendoListas() {

	        LinkedList<Integer> miLista = new LinkedList<>();
	        miLista.add(10);
	        miLista.add(2);
	        miLista.add(5);
	        miLista.add(7);
	        miLista.add(9);
	        miLista.add(2);
	        miLista.add(100);

	        LinkedList<Integer> Super = new LinkedList<>();
	        for (Integer unNumero : miLista) {

	            Super.add(unNumero * 2);
	        }

	        //Sin usar el metodo get() comprobá que el primer numero de la lista es 20
	        Assert.assertEquals(20, Super.getFirst(),0.0);

	        LinkedList<Integer> buenardo = new LinkedList<>();
	        Integer l = 0;
	        Integer tamaniolista = miLista.size();
	        while(l<tamaniolista) {
	        	buenardo.add(miLista.get(l));
	        	l++;
	        }
	        //Sin usar el metodo get() comprobá que el ultimo numero de la lista es 100
	        for (Integer integer : buenardo) {
				System.out.println(integer);
			}
	        Assert.assertEquals(100, buenardo.getLast(), 0.0);

	         //¿Que diferencia existe entre este bloque while y el for anterior?
	        //El bucle sin fin jaja
	        LinkedList<Integer> AboutTime = new LinkedList<>();
	        Integer j = 0;
	        Integer tamanioLista = miLista.size();
	        while (j < tamanioLista) {

	            if (miLista.get(j) > 9) {
	                AboutTime.add(miLista.get(j));
	                
	            }
	            j++;
	        }
	       // :) by jos
	    }
	   
}
