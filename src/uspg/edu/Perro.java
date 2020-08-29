/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author CARLOS VALLE
 */
public class Perro extends Mamifero {
    public Perro(String esqueleto, int vertebras, String sexo, String tipo_respiracion, String clase, String orden, String familia, String genero, String especie) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, clase, orden, familia, genero, especie);
    }
    
 

    public Perro(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
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
        System.out.println("Concentrado");
    }

  
    public void Comunicacion() {
        System.out.println("Ladridos");
    }

   
    public void Movimiento() {
        System.out.println("camino sobre cuatro patas "
                + "sobre los dedos de mis patitas");
    }
    
    public void Ladra(){
        System.out.println("guau! guau!");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("es el animal mas domestico, \n" +
        "es el mejor amigo del hombre. \n" +
        "gran habilidad para cuidar y de guardian, \n" +
        "con un buen olfato” \n" +
        "su destreza es morder \n" +
        "ataca cuando algo sale de control ");
        System.out.println("**************************************************");
    }
}

    
