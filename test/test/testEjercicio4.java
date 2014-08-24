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
        Ejercicio4 n = new Ejercicio4(2,4);
        Assert.assertEquals(n.getCatetoA(), 2);     
    }
    
    @Test
    public void testgetCatetoB(){
        Ejercicio4 n = new Ejercicio4(2,4);
        Assert.assertEquals(n.getCatetoB(), 4);     
    }
    
    
    @Test
    public void testcalcularHipotenusa(){
        Ejercicio4 n = new Ejercicio4(4,3);
        Assert.assertEquals(n.calcularHipotenusa(),5.0);
        
    }
}
