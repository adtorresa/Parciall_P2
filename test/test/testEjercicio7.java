/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import unbosque.Ejercicio7;

/**
 *
 * @author wilvergzalduae
 */
public class testEjercicio7 {
    
    @Test
    public void testgetCalificacion(){
        Ejercicio7 n = new Ejercicio7(20);
        Assert.assertEquals(n.getCalificacion(), 20);
    }
    
    @Test
    public void testgetNuevaNota(){
        Ejercicio7 n = new Ejercicio7(20);
        Assert.assertEquals(n.getNuevaNota(), "A");
        
        
    }
    
    
}
