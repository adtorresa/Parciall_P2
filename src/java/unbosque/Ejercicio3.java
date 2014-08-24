/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unbosque;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author F211
 */

@ManagedBean(name = "Ejercicio3")
public class Ejercicio3 {
    int N;
    int suma;
    String resultado;

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

 
    
    
    
    
    public void hacersumaHasta10(){
        for(int c = 1;c<=10;c++){
            suma= suma+c;
        }
        resultado = "la suma de los primeros" + 10 + " es: " + suma;
    }
    
    
    
}
