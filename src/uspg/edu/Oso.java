/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author DELL
 */
public class Oso extends Mamifero{
     public Oso (String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
      super(esqueleto, 
                vertebras, 
                sexo, 
                tipo_respiracion, 
                "Mamalia", 
                "Carnivoro", 
                "Felidae", 
                "Ursus maritimus", 
                "Ursidae Silvestris");
    }
    
    @Override
    public void Alimentacion() {
        System.out.println("me gusta el pezcado");
    }

    @Override
    public void Comunicacion() {
        System.out.println("mis patas y gruñido, grerrrr");
    }

    @Override
    public void Movimiento() {
        System.out.println("soy Silecioso cuando atrapo pescados "
                + "mis uñas son desgaradoras");
    }
    public void Produccion() {
        System.out.println("tengo a mi amada, con ella tengo dos hijos "
                + "chorchis y marchis,entramos en celo entre mayo y junio");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("puedo pareser muy cariñoso pero no es asi, \n" +
        "cuando veas que ando por tu zona escondete o huye. \n" +
        "soy un cazador y me gusta pescar en los rios, \n" +
        "soy muy grande, mas grande que tu” \n" +
        "mis patas son cortas y poderosas, con cinco dedos provistos de uñas \n" +
        "pero si no me molestas y te quedas quieto no pasara nada ");
        System.out.println("**************************************************");

    }
}
