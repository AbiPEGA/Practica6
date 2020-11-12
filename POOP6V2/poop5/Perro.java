/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author Abigail y Victor
 */
public class Perro {
    private String nombre;
    private String raza;
    private String sexo;
    private String color;
    boolean hambriento;
    boolean cansado;

    public Perro(){
        this.hambriento = true;
        this.cansado = true;
    }
    /**
     * 
     * @param nombre Es el nombre del perro, de tipo String
     * @param raza Es la raza de nuestro perro, de tipo String
     * @param color Es el color del perro, de tipo String
     */
    public Perro(String nombre,String raza, String color) {
       this.nombre=nombre;
       this.raza=raza;
       this.sexo= "Masculino";
       this.color=color;
       this.hambriento = false;
        this.cansado = true;
    }
    
    /**
     * 
     * @param nombre Es el nombre del perro, de tipo String
     * @param raza Es la raza del perro, de tipo String
     */
    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = "Femenino";
        this.color = "cafe";
        this.hambriento = false;
        this.cansado = false;
    }
    
    /**
     * 
     * @return nombre De tipo String, es el nombre de nuestro perro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre Es el nombre de nuestro perro, de tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return raza De tipo String, es la raza de nuestro perro
     */
    public String getRaza() {
        return raza;
    }

    /**
     * 
     * @param raza Es la raza de nuestro perro, de tipo String
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    /**
     * 
     * @return De tipo String, es el sexo de nuestro perro
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * 
     * @param sexo Es el sexo de nuestro perro, de tipo String
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * 
     * @return Concatenación de varias cadenas, donde están también nombre,raza,sexo y color.
     */
    @Override
    public String toString() {
        return "Perro{" + "Nombre= " + nombre + ", Raza= " + raza + ", Sexo= " + sexo + ", Color= " + color + '}';
    }
    
    /**
     * 
     * @param comida Es la comida que le darás al perro, de tipo String
     * @return hambriento de tipo boolean y lo determina falso
     */
    boolean comer (String comida) {
        if(hambriento==false) {
            System.out.println("No tengo hambre"); 
        }
        else {
            System.out.println("Estoy comiendo "+comida);
        }
        return hambriento=false;
    }
    
    /**
     * 
     * @param juguete Es el objeto con el que nuestro perro va a jugar, de tipo String
     */
    void jugar (String juguete) {
        System.out.println("Estoy jugando con " + juguete);
        hambriento=true;
        cansado=true;
    }
    
    /**
     * 
     * @param truco Es la acción que nuestro perro sabe hacer, de tipo String
     */
    void hacerTruco(String truco){
        System.out.println("Soy bueno en "+truco);
        cansado=true;
        
    }

    void dormir ( ) {
        System.out.println("Estoy durmiendo");
        cansado=false;
    }

}
