/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Otto
 */
public class Jaguar extends Mamifero {

    public Jaguar(String esqueleto, int vertebras, String sexo, String tipo_respiracion, String clase, String orden, String familia, String genero, String especie) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, clase, orden, familia, genero, especie);
    }
    
    
    public void alimentacion(){
        System.out.println("Soy un animal carnivoro");
    }
    public void habitat(){
        System.out.println("Habito en las junglas y selvas de Centroamerica y Sudamerica");
    }
    public void estado(){
        System.out.println("Mi especie se encuentra en un estado vulnerable");
    }
    public void datocurioso(){
              System.out.println("*******Dato Cuerioso********");
        System.out.println("Soy muy parecido a otro felino grando, al leopardo, la diferencia es que soy más grande y el habita en el continete africano.");
    }
}
