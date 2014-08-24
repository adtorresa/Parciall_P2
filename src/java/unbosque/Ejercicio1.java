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

@ManagedBean(name = "Ejercicio1")
public class Ejercicio1 {
 
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
     
     
    public void operacionCualesMayor(){
        
        if(a==b){
            resultado="Los numeros son iguales";
        }else if(a>b){
             resultado="El numero mayor es: " +a;
         }else{
            resultado="El numero menor es: " +b;    
     }
        
    }
    
}
