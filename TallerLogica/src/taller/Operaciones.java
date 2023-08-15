/*

Realice las siguientes operaciones:
3+8*5-6/3
2.5*2*3-4/2+8
2*(6-2.5)/3
25>18
3+2.5*4/3 != 4*5.2-3.8
(8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2)

 */
package taller;

/**
 *
 * @author Krausser
 */
public class Operaciones {

    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("Resultado de 3+8*5-6/3:  " + (3 + (8 * 5) - (6 / 3)));

        //Ejercicio 2
        System.out.println("Resultado de 2.5*2*3-4/2+8: " + ((2.5 * 2 * 3) - (4 / 2) + 8));

        //Ejercicio 3
        System.out.println("Resultado de 2*(6-2.5)/3:   " + (2 * ((6 - 2.5) / 3)));

        //Ejercicio 4
        System.out.println("¿25 es mayor que 18?: " + (25 > 18));

        //Ejercicio 5
        System.out.println("¿son diferentes?: " + (3 + (2.5 * (4 / 3)) != ((4 * 5.2) - 3.8)));

        //Ejercicio 6
        System.out.println("¿se cumplen ambas condiciones?: " + (((8.5 / 3.2) + 6.5 - (2.3 * (5 / 6)) >= 15.8) && (21.4 < ((81 / 4) + 2))));
    }
}
