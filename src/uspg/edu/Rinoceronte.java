
package uspg.edu;

public class Rinoceronte extends Mamifero {

    public Rinoceronte(String esqueleto, int vertebras, String sexo, String tipo_respiracion, String clase, String orden, String familia, String genero, String especie) {
        super(esqueleto, vertebras, sexo, tipo_respiracion, clase, orden, familia, genero, especie);
    }
public Rinoceronte(String esqueleto, int vertebras, String sexo, String tipo_respiracion) {
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

    
    
    
    @Override
    public void Alimentacion() {
        System.out.println("soy herbívoros");
    }

    @Override
    public void Comunicacion() {
        System.out.println("El uso de la respiración de comunicarse");
    }

    @Override
    public void Movimiento() {
        System.out.println("en puntillas: poseen tres dedos en sus patas"
                + " con una almohadilla suave que les ayuda a amortiguar su enorme peso.");
    }
    
    public void Rviguilar(){
        System.out.println("soy mujy habil para viguilar por medio del olfato y los sonidos ");
    }
    
    public void Anecdota(){
        System.out.println("*******Anecdota********");
        System.out.println("EN Guatemala no tenomos tantas posibilidades de convivir con un ricnoceronte\n" +
        "el gato lo mas cercano es ir al zoologico y verlos  \n" +
        "Tienen uno tengo memoria de convivir con uno \n" +
        "la utilisolo los eh visto en fotografias y en videos” \n" +
        "que les Son muy grandes y bonitos \n" +
        "cuando caunque su apariencia es grande y podemos tener temor pero son amigables  ");
        System.out.println("**************************************************");
    }
}
 
