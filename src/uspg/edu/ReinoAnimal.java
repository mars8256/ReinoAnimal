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

         elefante  elefante = new  elefante("Esqueleto Elefantesco",240,"Macho","Pulmones");
         elefante.Alimentacion();
         elefante.Comunicacion();
         elefante.Movimiento();
         elefante.Reproduccion();
         elefante.Respiracion();
         elefante.Anecdota();

        Gato gato = new Gato("Esqueleto Felino",240,"Macho","Pulmones");
        gato.Alimentacion();
        gato.Comunicacion();
        gato.Movimiento();
        gato.Reproduccion();
        gato.Respiracion();


        gato.Anecdota();    
        

       gato.Anecdota();    

        
        System.out.println("");
        System.out.println("loba");
        Loba Loba = new Loba("carnivoro",430,"Macho","Pulmones");
        gato.Alimentacion();
        gato.Comunicacion();
        gato.Movimiento();
        gato.Reproduccion();
        gato.Respiracion();
        gato.Anecdota();  

  

        System.out.println(" ");
        System.out.println("conejo");
        Conejo conejo = new Conejo("vegetariano", 340, "salto", "pulmones");
        conejo.Alimentacion();
        conejo.Movimiento();
        conejo.tipo_orejas();
        
        

        gato.Anecdota();

         
        Oso oso = new Oso("Esqueleto silvestre",210, "Macho","Pulmones");
        oso.Alimentacion();
        oso.Comunicacion();
        oso.Movimiento();
        oso.Produccion();
        oso.Anecdota();

        
        
        canguro canguro = new canguro("Esqueleto Mamifero",240 ,"Macho","Pulmones");
        canguro.Alimentacion();
        canguro.Comunicacion();
        canguro.Movimiento();
        canguro.Reproduccion();
        canguro.Respiracion();
        canguro.Anecdota();
        


        
        System.out.println(" ");
        System.out.println("Armadillo");
       
        Armadillo ar = new Armadillo("Esqueleto armado",2,"Macho", "Pulmones", "Armi");
        ar.Alimentacion();
        ar.Comunicacion();
        ar.Movimiento();
        ar.Anecdota();
        ar.Vivienda();


        Gorila gorila = new Gorila ("Esqueleto",60,"macho","pulmones");
        gorila.Alimentacion();
        gorila.Comunicacion();
        gorila.Movimiento();
        gorila.peleas();
        gorila.Anecdota();


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



        jaguar.datos(); 
        
        Cebra cebra = new Cebra ("Esqueleto Vertebral",7,"Macho","juegan");
        cebra.Alimentacion();
        cebra.Juegan();
        cebra.Comunicacion();
        cebra.Anecdota();
        
        Caballo caballo=new Caballo("Esqueleto felino",350,"Macho","Pulmonar","Animalia","Hervivoro","Equidae","Equus","E. Ferus");
        caballo.Anecdota();
        caballo.Raza();
        caballo.Color();
        
        Perro perro=new Perro("Esqueleto vertebral",7,"Macho","Pulmonar","Animalia","carnivoro","canidae","canis","c,lupus");
        perro.Alimentacion();
        perro.Anecdota();
        perro.Comunicacion();
        perro.Ladra();
        perro.Movimiento();
  



    
     }
}
    


    
