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
    public void testgetValor1(){
        Ejercicio3 n = new Ejercicio3();
        n.setN(4);
        Assert.assertEquals(n.getN(),4);     
    }
    
    @Test
    public void cualEsMayorNumeroMayor(){
        Ejercicio3 n = new Ejercicio3();
        n.setN(9);
        n.hacersumaHasta10();
        Assert.assertEquals(n.getResultado(),"la suma de los primeros 10 es: 55");
    }
    
    
}
