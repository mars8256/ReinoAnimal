/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Maria
 */
public class Nutria extends Mamifero {
    
    public Nutria(String esqueleto, int vertebras, String sexo,String tipo_respiracion, String clase, String orden, String familia, String genero,String especie){
        super(esqueleto, vertebras, sexo, tipo_respiracion, "Mamalia", "Carnivora", "Mustelidae", "Enhydra Flemming", "E.lutris");
    
    
        
    }
    public void Alimentacion(){
        System.out.println("Soy carnívoro");
    
    }
    
     public void Comunicacion(){
         System.out.println("me comunico con clics, gritos, chillidos y chirridos");
    }
     
     public void Movimiento(){
         System.out.println("Muevo mis patas y cola de arriba a bajo");
     }
     
     public void Adaptacion(){
         System.out.println("La habilidad de moverme en la tierra y en el agua");
     }
     
     public void Habitad(){
         System.out.println("Vivo en lugares que forman parte o están cerca al mar");
     }
     public void Anecdota(){
         System.out.println("---------------ANECDOTA-------------");
         System.out.println("Las nutrias son uno de los animales más inteligentes. Ellas hacen madrigueras cerca de los rios"
                 + "casi siempre con 2 entradas, una desde la tierra y la otra desde el agua. Este sistem las converte en una"
                 + "especie muy inteligente, ya que les sirve para escapar de los depredadores.");
         System.out.println("---------------------------------------------------");
     }
    
}
