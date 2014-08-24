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
@ManagedBean(name = "Ejercicio2")
public class Ejercicio2 {
    int valor1;
    int valor2;
    int valor3;
    String resultado;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
    public void cualEsMayor(){
        if(valor1>valor2){
            if(valor1>valor3){
                resultado = "El numero mayor es:"+valor1;
            }else if(valor2>valor3){
                resultado = "El numero mayor es:"+valor2;
            }else{
                resultado = "El numero mayor es:"+valor3;
            }
        }else if(valor2>valor3){
            resultado = "El numero mayor es:"+valor2;
        }else{
            resultado = "El numero mayor es:"+valor3;
        }
    }
   
    
    
}
