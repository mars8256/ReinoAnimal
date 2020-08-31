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
public class Caballo extends Mamifero {

    public Caballo(String esqueleto, int vertebras, String sexo, String tipo_respiracion, String clase, String orden, String familia, String genero, String especie) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, clase, orden, familia, genero, especie);
    }
    
    public void Anecdota(){
        System.out.println("Los caballos han sido un medio de transporte para la humanidad desde tiempos remotos, su uso fue en tiempo antiguos para comercio como hasta guerras y luego en epocas para mensajería. Actualmente se usan para hobbys en carreras de caballos\n"+"pero en la actualidad son usados para otros trabajos");
    }
    public void Raza(){
        System.out.println("Caballo Canadiense");
    }
    public void Color(){
        System.out.println("Blanco");
    }
}
