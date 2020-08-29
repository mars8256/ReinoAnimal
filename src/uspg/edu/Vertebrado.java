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
public abstract class Vertebrado extends Animal {
    
    public String esqueleto;
    public int vertebras;
    public String sexo;
    public String tipo_respiracion;

   

    public Vertebrado(String esqueleto, int vertebras, String sexo, String tipo_respiracion, String clase, String orden, String familia, String genero, String especie) {
        super("Animalia", "Chordata", clase, orden, familia, genero, especie);
        this.esqueleto = esqueleto;
        this.vertebras = vertebras;
        this.sexo = sexo;
        this.tipo_respiracion = tipo_respiracion;
        
        System.out.println("Debido a que soy un animal "
                + "vertebrado poseo un esqueleto");
        
    }

    
    
    
    public String getEsqueleto() {
        return esqueleto;
    }

    public void setEsqueleto(String esqueleto) {
        this.esqueleto = esqueleto;
    }

    public int getVertebras() {
        return vertebras;
    }

    public void setVertebras(int vertebras) {
        this.vertebras = vertebras;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo_respiracion() {
        return tipo_respiracion;
    }

    public void setTipo_respiracion(String tipo_respiracion) {
        this.tipo_respiracion = tipo_respiracion;
    }
    
    public void datos(){
        System.out.println(getEsqueleto()+"-"+getVertebras()+"-"+getSexo()+"-"+getTipo_respiracion());
    }
    

    
}
