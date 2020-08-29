/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author marit
 */
public class Hiena extends Mamifero {

    public Hiena(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, "Mamalia", "Carnivoro", "Felidae",  
                "Felis", "Felis Silvestris");
    }

    
    
    
    @Override
    public void Alimentacion() {
        System.out.println("Soy un carroñero oportunista");
    }

    @Override
    public void Comunicacion() {
        System.out.println("ruidos específicos, posturas y señales");
    }

    @Override
    public void Movimiento() {
        System.out.println("Camino directamente de mis cuatro patas, sin utilizar ningún otro metodo para"
                + "transportarme y llegar a mi destino");
    }
    
    public void Risa(){
        System.out.println("Aaa!, Aaa!, Ohh");
    }
    
    public void Aspecto(){
        System.out.println("Marron con manchas negras");
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

