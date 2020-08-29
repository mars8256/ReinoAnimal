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
         
        Oso oso = new Oso("Esqueleto silvestre",210, "Macho","Pulmones");
        oso.Alimentacion();
        oso.Comunicacion();
        oso.Movimiento();
        oso.Produccion();
        oso.Anecdota();
    }
    
     }
    
