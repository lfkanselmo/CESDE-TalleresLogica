/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Concesionario {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuál fue el total de ventas?: ");
        int n = read.nextInt();
        double venta, comision;
        int[] ventas = new int[n];

        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ingrese el precio de la venta " + (i + 1));
            venta = read.nextDouble();

            if (venta < 0) {
                System.out.println("valor erroneo");
                i--;
            } else if (venta <= 100000) {
                comision = venta * 0.015;
                System.out.println("la venta " + (i + 1) + " tiene comision de: " + comision + ". Venta total: " + (venta + comision));
            } else if (venta > 100000 && venta <= 250000) {
                comision = venta * 0.018;
                System.out.println("la venta " + (i + 1) + " tiene comision de: " + comision + ". Venta total: " + (venta + comision));
            } else {
                comision = venta * 0.023;
                System.out.println("la venta " + (i + 1) + " tiene comision de: " + comision + ". Venta total: " + (venta + comision));
            }
        }
    }
}
