/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Mercedes Mendoza
 */
public class Conejo extends Mamifero{

    public Conejo (String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
        super(esqueleto, 
                vertebras, 
                sexo, 
                tipo_respiracion, 
                "Mamalia", 
                "vegetariano", 
                "Felidae", 
                "Felis", 
                "Felis Silvestris");
    }

    
    
    
    @Override
    public void Alimentacion() {
        System.out.println("vegetariano");
    }

    /**
     *
     */
    @Override
    public void Comunicacion() {
        System.out.println("grrr, grrr");
    }

    @Override
    public void Movimiento() {
        System.out.println("Soy un digitigrado ya que camino directamente "
                + "sobre los dedos de mis patitas");
    }
    
    /**
     *
     */
    public void tipo_orejas (){
        System.out.println("largas y peludas + cortas");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("Son animales de distintos tamaños de oreja colores y pelaje, \n" +
        "Viven en grupos llamados madrigueras. \n" +
        "Crecen un máximo de cutro pies de largo, \n" +
        "Se reproducen a extensas velocidades” \n" +
        "Su expectativa de vida suele rondas los 10 años \n" +
        "Sus crías se llaman gazapos  \n" +
        "Su depredador natural son los coyotes, zorros y los gatosa salvajes" );
        System.out.println("**************************************************");
    }
}

