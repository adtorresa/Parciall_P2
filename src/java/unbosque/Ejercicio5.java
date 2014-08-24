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

@ManagedBean(name = "Ejercicio5")
public class Ejercicio5 {
    
    int r;
    int h;
    double calarea;
    double calvolumen;
    String area;
    String volumen;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }
    
    
    public void calVolumen() {
        calvolumen = (Math.PI)*(r*r)*h;
        volumen = "El volumen es " + calvolumen;
    }
    
    public void calArea() {
        calarea = 2*(Math.PI)*r*(h*r);
        volumen = "El area es " + calarea;
    }
    
}
