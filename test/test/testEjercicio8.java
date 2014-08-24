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
        Ejercicio8 n = new Ejercicio8(2,3);
        Assert.assertEquals(n.getNumero1aOrdenar(), 2);
    }
    
    @Test
    public void testgetNumero2aOrdenar(){
        Ejercicio8 n = new Ejercicio8(2,3);
        Assert.assertEquals(n.getNumero2aOrdenar(), 3);
    }
    
    @Test
    public void testnumerosOdenados(){
        Ejercicio8 n = new Ejercicio8(50,9);
        Assert.assertEquals(n.numerosOdenados(), "9,50");
    }
    
    
    
}
