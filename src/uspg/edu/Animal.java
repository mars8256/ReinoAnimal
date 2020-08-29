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
public abstract class Animal {
    public String reino;
    public String filum;
    public String clase;
    public String orden;
    public String familia;
    public String genero;
    public String especie;

    public Animal() {
        this.reino = "Animalia";
        System.out.println("Los animales pertenecen a uno "
                + "de los cinco reinos de la naturaleza");
        
    }

    public Animal(String reino, String filum, String clase, String orden, String familia, String genero, String especie) {
        this.reino = reino;
        this.filum = filum;
        this.clase = clase;
        this.orden = orden;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }

    
    
    
    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilum() {
        return filum;
    }

    public void setFilum(String filum) {
        this.filum = filum;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public abstract void Alimentacion();
    public abstract void Comunicacion();
    public abstract void Movimiento();
    public abstract void Reproduccion();
    public abstract void Respiracion();
    
    
    
}
 

