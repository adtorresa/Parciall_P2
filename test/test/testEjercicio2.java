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
        Ejercicio2 n = new Ejercicio2();
        n.setValor1(3);
        Assert.assertEquals(n.getValor1(),3);     
    }
    
    @Test
    public void testgetValor2(){
        Ejercicio2 n = new Ejercicio2();
        n.setValor2(3);
        Assert.assertEquals(n.getValor2(),3);
    }
    
    @Test
    public void testgetValor3(){
        Ejercicio2 n = new Ejercicio2();
        n.setValor3(3);
        Assert.assertEquals(n.getValor3(),3);
    }
    
    @Test
    public void cualEsMayorNumeroMayor(){
        Ejercicio2 n = new Ejercicio2();
        n.setValor1(3);
        n.setValor2(9);
        n.setValor3(1);
        n.cualEsMayor();
        Assert.assertEquals(n.getResultado(),"El numero mayor es:9 y el numero menor es: 1");
    }
}
