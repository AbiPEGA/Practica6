/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Ésta es la clase persona que se uso 
 * @author Abigail Peñafiel
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private Fecha fNacimiento;

    public Persona() {
    }
    /**
     * Constructor que recibe tres parámetros
     * @param Nombre Es el nombre de nuestra persona, es de tipo String.
     * @param Apellido Es el appellido de nuestra persona, es tipo String.
     * @param fNacimiento Es la fecha de nacimiento de nuestra persona, es de tipo Fecha
     */
    public Persona(String Nombre, String Apellido, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = fNacimiento;
    }

    /**
     * 
     * @param Nombre Es el nombre de nuestra persona, de tipo String
     * @param Apellido Es el apellido de nuestra persona, de tipo String.
     */
    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = new Fecha(3,5,2000);
    }
    
    /**
     * 
     * @return Nombre Es de tipo String y es el nombre de nuestra persona.
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * 
     * @param Nombre Es el nombre de nuestra persona, de tipo String.
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * 
     * @return Apellido Es de tipo String y es el apellido de nuestra persona.
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * 
     * @param Apellido Es el apellido de nuestra persona, de tipo String.
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    /**
     * 
     * @return fNacimiento Es de tipo Fecha, es la fecha de nacimiento de nuestra persona
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    /**
     * 
     * @param fNacimiento Es la fecha de nacimineto de nuestra persona, es de tipo Fecha.
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    /**
     * 
     * @return Una cadena compuesta de diferentes cadenas y los valores Nombre de tipo String, Apellido de tipo String y fNacimiento de tipo Fecha.
     */
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fNacimiento=" + fNacimiento + '}';
    }
    
}
