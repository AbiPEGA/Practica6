/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author Abigail
 */
public class Circulo {
    static double PI = Math.PI;
    private double radio;
    private String color;

    public Circulo() {
    }

    /**
     * 
     * @param radio Es el radio de nuestro círculo, de tipo double
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * 
     * @return radio De tipo double, es el radio de nuestro círculo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * 
     * @param radio Es el valor asignado al radio de nuestro círculo, de tipo double
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * 
     * @return Concatenación de varias cadenas, donde están también los valores radio, color de tipo double y string respectivamente
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
    
    /**
     * 
     * @return perimetro De tipo double, es el valor resultante de multiplicar PI por radio por 2
     */
    public double perimetro(){
        return 2*PI*radio;
    }
    
    /**
     * 
     * @return area De tipo double, es el valor resultante de calcular PI por radio por radio
     */
    public double area(){
        return PI*radio*radio;
    }
    
}
