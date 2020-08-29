/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author morozco
 */
public class Gato extends Mamifero {

    public Gato(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
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

    
    
    
    @Override
    public void Alimentacion() {
        System.out.println("Soy carivoro");
    }

    @Override
    public void Comunicacion() {
        System.out.println("Miau, Miau");
    }

    @Override
    public void Movimiento() {
        System.out.println("Soy un digitigrado ya que camino directamente "
                + "sobre los dedos de mis patitas");
    }
    
    public void Ronronea(){
        System.out.println("Grrrr miau! Grrrr miau!");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("Aunque el perro puede parecer el animal doméstico por excelencia, \n" +
        "el gato convive con el ser humano desde hace más de 9 mil años. \n" +
        "Tienen una gran destreza,gracias a la flexibilidad de sus patas, \n" +
        "la utilización de su cola y su “reflejo de enderezamiento” \n" +
        "que les permite girar su cuerpo en el aire \n" +
        "cuando caen y así caer siempre sobre sus patas ");
        System.out.println("**************************************************");
    }
}
