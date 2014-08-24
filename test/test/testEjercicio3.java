/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import unbosque.Ejercicio3;

/**
 *
 * @author F211
 */
public class testEjercicio3 {
    
    @Test
    public void testasignarContador(){
        Ejercicio3 n = new Ejercicio3();
        Assert.assertEquals(n.asignarContador(2), 3);     
    }
    
    @Test
    public void testsuma(){
        Ejercicio3 n = new Ejercicio3();
        Assert.assertEquals(n.sumaContador(2,2), 4);     
    }
    
    @Test
    public void testhacersumaHasta10(){
        Ejercicio3 n = new Ejercicio3();
        Assert.assertEquals(n.hacersumaHasta10(), 55); 
    }
    
    
    

    
}
