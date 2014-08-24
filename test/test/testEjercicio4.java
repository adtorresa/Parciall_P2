/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import unbosque.Ejercicio4;

/**
 *
 * @author F211
 */
public class testEjercicio4 {
    
    @Test
    public void testgetCatetoA(){
        Ejercicio4 n = new Ejercicio4();
        n.setA(2);
        Assert.assertEquals(n.getA(), 2);     
    }
    
    @Test
    public void testgetCatetoB(){
        Ejercicio4 n = new Ejercicio4();
        n.setB(2);
        Assert.assertEquals(n.getB(), 2);     
    }
    
    
    @Test
    public void testcalcularHipotenusa(){
        Ejercicio4 n = new Ejercicio4();
        n.setA(2);
        n.setB(2);
        n.calcularHipotenusa();
        Assert.assertEquals(n.getResultado(), "La hipotenusa es: 2.8284271247461903");
        
    }
}
