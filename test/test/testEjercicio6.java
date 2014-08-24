/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import unbosque.Ejercicio6;

/**
 *
 * @author wilvergzalduae
 */
public class testEjercicio6 {
    
    @Test
    public void testgetvalor(){
        Ejercicio6 n = new Ejercicio6();
        n.setA(4);
        Assert.assertEquals(n.getA(), 4);
    }
    
    @Test
    public void testesUnNumeroPar(){
        Ejercicio6 n = new Ejercicio6();
        n.setA(5);
        n.esUnNumeroPar();
        Assert.assertEquals(n.getResultado(), "El numero 5 es impar");
    }
    
}
