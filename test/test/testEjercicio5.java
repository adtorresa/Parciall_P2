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
        Ejercicio5 n = new Ejercicio5();
        n.setR(4);
        Assert.assertEquals(n.getR(), 4);
    }
    
    @Test
    public void testgetAltura(){
        Ejercicio5 n = new Ejercicio5();
        n.setH(6);
        Assert.assertEquals(n.getH(), 6);
    }
    
    @Test
    public void testgetVolumen(){
        Ejercicio5 n = new Ejercicio5();
        n.setR(4);
        n.setH(6);
        n.calVolumen();
        Assert.assertEquals(n.getVolumen(),"El volumen es 301.59289474462014");
    }
    
    @Test
    public void testgetArea(){
        Ejercicio5 n = new Ejercicio5();
        n.setR(2);
        n.setH(1);
        n.calArea();
        Assert.assertEquals(n.getArea(),"El area es 25.132741228718345");
    }
    
    
}
