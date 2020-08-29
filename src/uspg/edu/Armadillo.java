/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Bryan Sandoval
 */
public class Armadillo extends Mamifero {

    public Armadillo(String esqueleto, int vertebras, String sexo, String tipo_respiracion, String nombre) {
        super(esqueleto, 
                vertebras, 
                sexo, 
                tipo_respiracion,
                "Mamalia", 
                "Omnivoro", 
                "Felidae", 
                "Felis", 
                "Felis Silvestris");
    }
   
    
    
   
    public void Alimentacion() {
        System.out.println("Como lombrices y muchas otas cosas");
    }

   
    public void Comunicacion() {
        System.out.println("Me comunico con un lenguje muy especial");
    }

    
    public void Movimiento() {
        System.out.println("Uno de mis movimientos es haceme una "
                + "bolita para confundir a mis amenasas");
    }
    
    public void Vivienda() {
        System.out.println("Vivo en sonas humedas");
    }
    
    public void Anecdota(){
        System.out.println("------------------Anecdota----------------------");
        System.out.println("Muchas personas me confunden con los famosos cusos que"
                + "se encuentran en guatemala pero en realidad solo somos familiares");
        System.out.println("-----------GRACIAS---------------");
    } 

 
   

    
     
}
