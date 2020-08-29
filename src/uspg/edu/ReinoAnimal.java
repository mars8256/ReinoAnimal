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
public class ReinoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato("Esqueleto Felino",240,"Macho","Pulmones");
        gato.Alimentacion();
        gato.Comunicacion();
        gato.Movimiento();
        gato.Reproduccion();
        gato.Respiracion();
        gato.Anecdota();
        
        
        canguro canguro = new canguro("Esqueleto Mamifero",240 ,"Macho","Pulmones");
        canguro.Alimentacion();
        canguro.Comunicacion();
        canguro.Movimiento();
        canguro.Reproduccion();
        canguro.Respiracion();
        canguro.Anecdota();
        


        System.out.println(" ");
        System.out.println("Hiena: ");
        Hiena hiena = new Hiena("Esqueleto Feliformia", 330, "Macho", "Pulmones");
        hiena.Alimentacion();
        hiena.Comunicacion();
        hiena.Movimiento();
        hiena.Reproduccion();
        hiena.Respiracion();
        hiena.Anecdota();
        hiena.Aspecto();
        hiena.Risa();
        

        Jaguar jaguar=new Jaguar("Esqueleto felino",200,"Macho","Pulmonar","Mamalia","Carnivoro","Felidae","Felis","Felis Silvestris");
        jaguar.alimentacion();
        jaguar.habitat();
        jaguar.estado();
        jaguar.datocurioso();

        jaguar.datos();


        jaguar.datos(); 
        
        Cebra cebra = new Cebra ("Esqueleto Vertebral",7,"Macho","juegan");
        cebra.Alimentacion();
        cebra.Juegan();
        cebra.Comunicacion();
        cebra.Anecdota();
  


    }
    
}
