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
public abstract class Mamifero extends Vertebrado {
    
    public String piel;
    public int extremidades;
    
    
    public Mamifero(String esqueleto, int vertebras, String sexo, String tipo_respiracion, String clase, String orden, String familia, String genero, String especie) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, "Mamalia", orden, familia, genero, especie);
        System.out.println("Debido a que soy un mamífero "
                + "mi tempeatura corporal se mantiene entre 36 y 41 ºC ");
                
    }

    @Override
    public void Reproduccion() {
        System.out.println("La mayoría somos vivíparos");
    }

    @Override
    public void Respiracion() {
        System.out.println("Respiro por medio de mis pulmones");
    }
    
}
