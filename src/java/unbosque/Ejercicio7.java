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
@ManagedBean(name = "Ejercicio7")
public class Ejercicio7 {
    
    int calificacion;
    String resultado;

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    

    
    public void calculoNuevaNota(){
        if(calificacion>=19 && calificacion<=20){
             resultado = "La nueva nota es : A";
        }else if(calificacion>=16 && calificacion<=18){
            resultado = "La nueva nota es : B";
        }else if(calificacion>=13 && calificacion<=15){
            resultado = "La nueva nota es : C";
        }else if(calificacion>=10 && calificacion<=12){
            resultado = "La nueva nota es : D";
        }else if(calificacion>=1 && calificacion<=9){
            resultado = "La nueva nota es : E";
        }else
        resultado = "NOTA FUERA DEL RANGO";
    }
    
}
