/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import unbosque.Ejercicio8;

/**
 *
 * @author wilvergzalduae
 */
public class testEjercicio8 {
    
    @Test
    public void testgetNumero1aOrdenar(){
        Ejercicio8 n = new Ejercicio8();
        n.setA(3);
        Assert.assertEquals(n.getA(),3);
    }
    
    @Test
    public void testgetNumero2aOrdenar(){
        Ejercicio8 n = new Ejercicio8();
        n.setB(4);
        Assert.assertEquals(n.getB(),4);
    }
    
    @Test
    public void testnumerosOdenados(){
        Ejercicio8 n = new Ejercicio8();
        n.setA(5);
        n.setB(1);
        n.numerosOdenados();
        Assert.assertEquals(n.getResultado(), "El orden de menor a mayor es: 1,5");
    }
    
    
    
}
