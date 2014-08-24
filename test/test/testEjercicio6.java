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
        Ejercicio6 n = new Ejercicio6(5);
        Assert.assertEquals(n.getvalor(), 5);
    }
    
    @Test
    public void testesUnNumeroPar(){
        Ejercicio6 n = new Ejercicio6(8);
        Assert.assertEquals(n.esUnNumeroPar(), true);
    }
    
}
