/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author ZETINO
 */
public class Puma extends Mamifero {

    public Puma (String esqueleto, int vertebras, String sexo, String tipo_respiracion, String clase, String orden, String familia, String genero, String especie) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, clase, orden, familia, genero, especie);
    }
public Puma (String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
        super(esqueleto, 
                vertebras, 
                sexo, 
                tipo_respiracion, 
                "Mamalia", 
                "Carnivoro", 
                "Felidae", 
                "Felis", 
                "Felis Silvestris");
    }

    
    
    

    public void Alimentacion() {
        System.out.println("soy Carnivoro**");
    }


    public void Comunicacion() {
        System.out.println("por un rujido**");
    }


    public void Movimiento() {
        System.out.println("en puntillas: poseen cinco dedos en sus patas"
                + " con unas filosas garras******.");
    }
    
    public void cazar(){
        System.out.println("corre muy rapido para atrapar sus presas****/ ");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("los pumas son animales muy peligrosos* \n" +
        "Que no convive con los seres humanos ");
        System.out.println("**************************************************");
    }
}
 

    

