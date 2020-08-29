/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Mejía Sánchez
 */
public class canguro extends Mamifero {

    public canguro (String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
        super(esqueleto, 
                vertebras, 
                sexo, 
                tipo_respiracion, 
                "Chordata", 
                "Herbivoro", 
                "Marsupialia", 
                "Mammalia", 
                "Diprotodontia");
    }

    
    
    
    
    public void Alimentacion() {
        System.out.println("Soy Herbivoro");
    }

    
    public void Comunicacion() {
        System.out.println("me comunico con chasquidos.");
    }

   
    public void Movimiento() {
        System.out.println("Soy un pentapodo  ya que camino con cinco patas "
                + "utilizo la cola como una pata mas");
    }
    
    public void Ronronea (){
        System.out.println("ruccchhh, ruccchh");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("Los canguros son el único animal de gran tamaño que salta para movilizarse, \n" +
        "los canguros son muy rápidos y les permite cubrir grandes territorios en lugares donde no hay mucha agua o comida. \n" +
        "Tienen una gran destreza,gracias a la flexibilidad de sus patas, \n" +
        "El canguro rojo es la especie de canguro de mayor tamaño” \n" +
        "Los canguros son tan típicos de Australia que hasta aparecen en el escudo del país \n" +
        "Los canguros son mamíferos y macropódidos");
        System.out.println("**************************************************");
    }
}

    

