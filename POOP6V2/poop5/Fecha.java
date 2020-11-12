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
class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    /**
     * 
     * @param dia Es el día en que nacio nuestra persona, de tipo int
     * @param mes Es el mes de nacimiento de nuestra persona, de tipo int
     * @param anio Es el año de nacimiento de nuestra persona, de tipo int
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    /**
     * 
     * @return dia De tipo int, es el día en que nacio nuestra persona
     */
    public int getDia() {
        return dia;
    }

    /**
     * 
     * @param dia Es el día del nacimiento de nuestra persona, de tipo int
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * 
     * @return mes De tipo int, es el mes en el que nacio nuestra persona
     */
    public int getMes() {
        return mes;
    }

    /**
     * 
     * @param mes Es el mes en el que nacio nuestra persona, de tipo int
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * 
     * @return anio De tipo int, es el año de nacimiento de nuestra persona
     */
    public int getAnio() {
        return anio;
    }

    /**
     * 
     * @param anio Es el año en el que nacio nuestra persona, de tipo int
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * 
     * @return Concatenación de varias cadenas, donde están también día, mes y año
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

    
}
