/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author chejo
 */
public class elefante extends Mamifero {

    public elefante(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
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
        System.out.println("Soy hervivoro");
    }

   
    public void Comunicacion() {
        System.out.println("frrrr, frrrr");
    }

    
    public void Movimiento() {
        System.out.println("Soy un snimsl muy grande que me muevo muy rapido"
                + "sobre mis patas grandes y agiles");
    }
    
    public void Ronronea(){
        System.out.println("frrrr! frrrr!");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("el elefante puede parecer el animal mas manso del mundo, \n" +
        "el elefante no convive con el ser humano desde hacemuchos años. \n" +
        "Tienen una gran destreza,gracias a la flexibilidad de sus trompa, \n" +
        "la utilización de su trompa y su “reflejo de enderezamiento” \n" +
        "que les permite tomar sus alimentos del suelo para su boca \n" +
        "para poder alimentarse de una forma correcta ");
        System.out.println("**************************************************");
    }
    
}
