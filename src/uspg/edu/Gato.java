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
    
}
