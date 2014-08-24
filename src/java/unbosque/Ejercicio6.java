/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unbosque;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author wilvergzalduae
 */
@ManagedBean(name = "Ejercicio6")
public class Ejercicio6 {
    
    int a;
    String resultado;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    

    public void esUnNumeroPar() {
        if(a%2==0){
            resultado = "El numero " +a+" es par";
        }else
            resultado = "El numero " +a+" es impar";     
    }
    
}
