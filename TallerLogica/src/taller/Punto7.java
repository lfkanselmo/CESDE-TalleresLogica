/*
Realice un programa que cada vez que  salga el numero 5 incremente en 1 punto la 
variable poder y cada vez que salga 3 disminuyan la variable vida. 
Implemente random para obtener números aleatorios.

 */
package taller;

/**
 *
 * @author Krausser
 */
public class Punto7 {

    public static void main(String[] args) {
        int poder = 0, vida = 10;
        int num;

        do {
            num = (int) (Math.random() * 5 + 1);
            if (num == 3) {
                vida--;
            } else if (num == 5) {
                poder++;
            }
        } while (vida > 0);
        
        System.out.println("Obtuvo " + poder + " de poder");

    }
}
