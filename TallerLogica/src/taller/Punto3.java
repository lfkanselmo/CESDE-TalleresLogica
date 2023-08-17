/*
Considere que se dispone de la producción de carbón ( en toneladas) de los últimos 12 meses. 
Con estos datos se quiere calcular e imprimir el promedio anual de toneladas.
Datos: podCarbon1, podCarbon2…podCarbon12.

 */
package taller;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Punto3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tama = 12;
        double[] producAnual = new double[tama];
        
        double sum = 0, promedio;
        
        for (int i = 0; i < tama; i++) {
            System.out.println("Ingrese la produccion en toneladas del mes " + (i+1));
            producAnual[i] = read.nextDouble();
            sum =+ producAnual[i];
        }
        
        
        for (int i = 0; i < tama; i++) {
            System.out.println("El mes " + (i+1) + " se produjo " + producAnual[i]);
        }
        
        promedio = sum / tama;
        System.out.println("el promedio anual fue de: " + promedio + " toneladas");
        
    }
}
