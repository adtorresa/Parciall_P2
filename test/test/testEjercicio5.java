/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import unbosque.Ejercicio5;

/**
 *
 * @author wilvergzalduae
 */
public class testEjercicio5 {
    
    @Test
    public void testgetRadio(){
        Ejercicio5 n = new Ejercicio5(2,3);
        Assert.assertEquals(n.getRadio(), 2);
    }
    
    @Test
    public void testgetAltura(){
        Ejercicio5 n = new Ejercicio5(2,3);
        Assert.assertEquals(n.getAltura(), 3);
    }
    
    @Test
    public void testgetVolumen(){
        Ejercicio5 n = new Ejercicio5(2,3);
        Assert.assertEquals(n.getVolumen(), 37.69911184307752);
    }
    
    @Test
    public void testgetArea(){
        Ejercicio5 n = new Ejercicio5(2,3);
        Assert.assertEquals(n.getArea(), 75.39822368615503);
    }
    
}
