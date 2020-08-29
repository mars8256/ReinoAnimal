/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author marit
 */
public class Hiena extends Mamifero {

    public Hiena(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, "Mamalia", "Carnivoro", "Feliformia",  
                "Hyaenidae", "Hiénidos ");
    }

    
    
    
    @Override
    public void Alimentacion() {
        System.out.println("Soy un carroñero oportunista");
    }

    @Override
    public void Comunicacion() {
        System.out.println("ruidos específicos, posturas y señales");
    }

    @Override
    public void Movimiento() {
        System.out.println("Camino directamente de mis cuatro patas, sin utilizar ningún otro metodo para"
                + "transportarme y llegar a mi destino");
    }
    
    public void Risa(){
        System.out.println("Aaa!, Aaa!, Ohh");
    }
    
    public void Aspecto(){
        System.out.println("Marron con manchas negras");
    }
    
    public void Anecdota(){
        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("---------Datos Curiosos---------");
        System.out.println("Las hienas no es que se esten riendo, si no es que el sonido chillón que emiten indica que están nerviosas, lo hacen cuando se"
                + " sienten amenazadas, en peligro, o cuando un congénere quiere quitarle la comida que tanto le ha costado conseguir.");
        System.out.println("Aunque no lo aparentan son criaturas inteligentes, incluso se puede decir que pueden"
                + "ser más inteligentes que los chimpancés");
        System.out.println("Las hienas solo cazan por manada, de esa manera se le es más fácil acorralar a su presa");
        System.out.println("Las hienas manchadas femeninas son más musculosas y más agresivas que sus homólogos masculinos, "
                + "ademas que poseen un pseudo-pene");
        System.out.println("Las poderosas mandíbulas y tracto digestivo de la hiena le permiten procesar y obtener los nutrientes de la piel y los huesos. Las únicas partes de"
                + " la presa no son completamente digeridas son el pelo, cuernos y pezuñas; estos son regurgitados en forma de pellets.");
        System.out.println("------------------------------------------------------------------------");
    }
}

