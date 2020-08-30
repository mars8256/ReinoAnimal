/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Usuario
 */
public class Zorro extends Mamifero {

    public Zorro(String esqueleto, int vertebras, String sexo, String tipo_respiracion, String clase, String orden, String familia, String genero, String especie) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, clase, orden, familia, genero, especie);
    }
public Zorro(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
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
        System.out.println("soy carnivoro");
    }


    public void Comunicacion() {
        System.out.println("auu auuuuuu auuuu");
    }


    public void Movimiento() {
        System.out.println(" me muevo con 4 patas y tiengo una gran agilidad .");
    }
    
    public void correr(){
        System.out.println(" soy muy rapido para correr y habil para cazar ");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("De pequeño intente tocar un zorro y casi se me tiraba en cima  ");
        System.out.println("**************************************************");
    }
}
 
