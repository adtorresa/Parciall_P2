/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import unbosque.Ejercicio1;

/**
 *
 * @author F211
 */
public class testEjercicio1 {
    
    @Test
    public void testgetValor1(){
        Ejercicio1 n = new Ejercicio1();
        n.setA(2);
        Assert.assertEquals(n.getA(),2);     
    }
    
    @Test
    public void testgetValor2(){
        Ejercicio1 n = new Ejercicio1();
        n.setB(3);
        Assert.assertEquals(n.getB(),3);
    }
    
    @Test
    public void testsonIguales(){
        Ejercicio1 n = new Ejercicio1();
        n.setA(2);
        n.setB(2);
        n.operacionCualesMayor();
        Assert.assertEquals(n.getResultado(),"Los numeros son iguales");
    }
    
    @Test
    public void cualEsMayor(){
        Ejercicio1 n = new Ejercicio1();
        n.setA(6);
        n.setB(2);
        n.operacionCualesMayor();
        Assert.assertEquals(n.getResultado(),"El numero mayor es: 6");
    }
    
}
