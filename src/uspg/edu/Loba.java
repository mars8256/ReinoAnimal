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
public class Loba extends Mamifero {

    public Loba (String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
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
        System.out.println("Soy carivoro");
    }

  
    public void Comunicacion() {
        System.out.println("Ahoooo, Ahooo");
    }

   
    public void Movimiento() {
        System.out.println("Soy un digitigrado ya que camino directamente "
                + "sobre los dedos de mis patitas");
    }
    
    public void Ronronea(){
        System.out.println("Grrrr ahooo! Grrrr ahoooo!");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("Los lobos son sumamente unidos, \n" +
        "son criaturas indomables. \n" +
        "el jefe de la manada cuida a todos desde atrás, \n" +
        "su olfato es 100 veces mejor que el de un humano” \n" +
        "se aparean entre enero y abril \n" +
        "recorre distancias entre 50 y 120 km en 8 horas ");
        System.out.println("**************************************************");
    }
}
  
