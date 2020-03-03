/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;

/**
 *
 * @author Yo
 */
public class metodos extends valores{

    public void Fin (){
        if(Pueblo == 0 || Pueblo == 100) {
            System.out.println("Mi lord el pueblo esta prosperando demasiado la opinion publica ya no le necesita");
            System.exit(0);
        } 
        if(Dinero == 0 || Dinero == 100) {
            System.out.println("Mi lord las arcas del reino estan vacias a este paso no sobreviviremos");
            System.exit(0);
        } 
        if(Ejercito == 0 || Ejercito == 100) {
            System.out.println("Mi lord nuestro ejercito supone una causa");
            System.exit(0);
        } 
        if(Recursos == 0 || Recursos == 100) {
            System.out.println("Mi lord el pueblo se muere de hambre");
            System.exit(0);
        }
        
    
    }
}
