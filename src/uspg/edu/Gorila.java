/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Nohemi Aguilar
 */
public class Gorila  extends Mamifero {

    public Gorila(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
        super(esqueleto,vertebras,sexo, tipo_respiracion,"Mamalia","primate","hominidos","gorilla","savage");
    }

    
    
    
    @Override
    public void Alimentacion() {
        System.out.println("vegetariano");
    }

    @Override
    public void Comunicacion() {
        System.out.println("gugu, gugu.");
    }

    @Override
    public void Movimiento() {
        System.out.println("Camino y aveces me valanceo en las ramas de los armoles");
    }
    
    public void peleas(){
        System.out.println("aveces peleamos por obetner una pareja o por ser el lider");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("Desde hace mucho tiempo los humanos nos encierran en jaulas y siempre descubren rasgos con los seres humanos");
        System.out.println("**************************************************");
    }
}
  
