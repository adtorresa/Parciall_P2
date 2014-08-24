/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import unbosque.Ejercicio2;

/**
 *
 * @author F211
 */
public class testEjercicio2 {
    
     @Test
    public void testgetValor1(){
        Ejercicio2 n = new Ejercicio2(2,4,5);
        Assert.assertEquals(n.getValor1(), 2);     
    }
    
     @Test
    public void testgetValor2(){
        Ejercicio2 n = new Ejercicio2(2,4,5);
        Assert.assertEquals(n.getValor2(), 4);     
    }
    
    @Test
    public void testgetValor3(){
        Ejercicio2 n = new Ejercicio2(2,4,5);
        Assert.assertEquals(n.getValor3(), 5);     
    }
    
    @Test
    public void testaEsMayorQueLosOtrosNumeros(){
        Ejercicio2 n = new Ejercicio2(5,2,1);
        Assert.assertEquals(n.aEsMayor(), true);     
    }
    
    @Test
    public void testbEsMayorQueLosOtrosNumeros(){
        Ejercicio2 n = new Ejercicio2(2,7,1);
        Assert.assertEquals(n.bEsMayor(), true);     
    }
    
    @Test
    public void testcEsMayorQueLosOtrosNumeros(){
        Ejercicio2 n = new Ejercicio2(2,2,8);
        Assert.assertEquals(n.cEsMayor(), true);     
    }
    
    
    
}
