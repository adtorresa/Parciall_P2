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
@ManagedBean(name = "Ejercicio4")
public class Ejercicio4 {
    int a;
    int b;
    double hipotenusa;
    String resultado;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
    public void calcularHipotenusa(){
        int aux = (a*a)+(b*b);
        hipotenusa = Math.sqrt(aux);
        resultado = "La hipotenusa es: " + hipotenusa;  
    }
    
}
