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
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(6.0);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("Perimetro c1 = " + c1.perimetro());
        System.out.println("Area del c1 = " + c1.area());

        System.out.println("Perimetro c2 = " + c2.perimetro());
        System.out.println("Area del c2 = " + c2.area());

        System.out.println("********************");
        c1.setRadio(9.0);
        System.out.println("Perimetro c1 = " + c1.perimetro());
        System.out.println("Area del c1 = " + c1.area());

        System.out.println("**********2**********");
        Persona amigo = new Persona();
        Fecha fNacimiento = new Fecha(3,4,2002);
        amigo.setNombre("Edgar");
        amigo.setApellido("Romero Martinez");
        amigo.setfNacimiento(fNacimiento);
        System.out.println("Info de mi amigo: " + amigo.toString());

        System.out.println("Info de mi amigo: " + amigo);

        Persona amigo2 = new Persona("Raul","Ayala Barbosa", new Fecha(20,4,1993));

        System.out.println("Info Amigo 2= " + amigo2);

        Persona amigo3 = new Persona("Diego","Pedraza Peralta");
        System.out.println("Info Amigo 3= " + amigo3);

        System.out.println("********************");
        Perro dog = new Perro();
        dog.setNombre("Manchas");
        dog.setRaza("Dogo De Burdeos");
        dog.setSexo("Masculino");
        System.out.println("Info del perro 1: " + dog.toString());

        System.out.println("Info del perro 1: " + dog);
        System.out.println("¿El perro " + dog.getNombre() + " tiene hambre? " + dog.hambriento);
        boolean ham = dog.comer("croquetas");
        System.out.println("¿El perro " + dog.getNombre() + " tiene hambre? " + ham);
        dog.jugar("pelota");
        dog.hacerTruco("dar la patita");

        Perro dog2 = new Perro("Horton","Pitbull","Negro");

        System.out.println("Info perro 2= " + dog2);
        System.out.println("¿El perro " + dog2.getNombre() + " tiene hambre? " + dog2.hambriento);
        ham = dog2.comer("pollo");
        System.out.println("¿El perro " + dog2.getNombre() + " tiene hambre? " + ham);
        dog2.jugar("hueso");
        dog2.hacerTruco("saltar muebles");

        Perro dog3 = new Perro("Laika","Beagle");
        System.out.println("Info perro 3= " + dog3);
        System.out.println("¿El perro " + dog3.getNombre() + " tiene hambre? " + dog3.hambriento);
        ham = dog3.comer("pollo y croquetas");
        System.out.println("¿El perro " + dog3.getNombre() + " tiene hambre? " + ham);
        dog3.jugar("pelota");
        dog3.hacerTruco("llevar la pelota");
    }

}
