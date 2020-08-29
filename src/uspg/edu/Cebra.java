/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Emmanuel Zapata
 */
public class Cebra extends Mamifero {
    
       public Cebra(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
        super(esqueleto, vertebras,sexo,tipo_respiracion,"Mamalia","Vegetariano","Equus grevyi","Zebra","Equus quagga,");
    }

    
    
    
    public void Alimentacion() {
        System.out.println("Soy vegetariano");
    }

    public void Comunicacion() {
        System.out.println(" Ian,Ian");
    }

    public void Movimiento() {
        System.out.println("Tengo las patatas mas poderosas ");
    }
    
    public void Juegan(){
        System.out.println(" se persiguen entre ellos ");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("Pero en el caso de las cebras, la respuesta es clara: son negras con rayas blancas, \n" +
        "En efecto, se ha comprobado que los embriones son negros y van desarrollando las rayas blancas durante la gestación, \n" +
        "Cuando nacen, las cebras tienen un patrón de rayas único: ¡no hay dos iguales! Sería algo similar a lo que sucede con nuestras huellas dactilares De hecho, son capaces de reconocerse entre ellas por su patrón de rayas, \n" +
        "La palabra cebra (y su variante zebra) procede de la Península Ibérica. En concreto, fueron los navegantes portugueses quienes lo llevaron a África durante sus viajes de exploración. Se cuenta que las simpáticas cebras les recordaban a los encebros o zebros, una especie de asno salvaje que habitaba en la Península durante la época medieval.\n" +
        "Una gran agudeza visual… y de todos los sentidos\n" +
"Estos parientes lejanos de los caballos y los asnos no solo tienen una agudísima visión que les permite ver a largas distancias. También son capaces de ver muy bien en la oscuridad, y se cree que, a diferencia de otros animales, ven en color. Además, tanto su olfato como su oído están muy desarrollados. \n" +
        "Las cebras tienen unas patas muy poderosas ");
        System.out.println("**************************************************");
       
    }
}