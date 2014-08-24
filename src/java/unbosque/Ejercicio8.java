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
@ManagedBean(name = "Ejercicio8")
public class Ejercicio8 {
    
    int a;
    int b;
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
    
    

    
    public void numerosOdenados(){
        if(a>b){
            resultado="El orden de menor a mayor es: "+ b+","+a;
        }else
            resultado="El orden de menor a mayor es: "+a+","+b;
    }
    
    
    
}
