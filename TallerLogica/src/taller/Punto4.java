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
public class Punto4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuál fue el total de ventas?: ");
        int n = read.nextInt();
        double venta, comision;

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el precio de la venta " + i);
            venta = read.nextDouble();

            if (venta < 0) {
                System.out.println("valor erroneo");
                i--;
            } else if (venta <= 100000) {
                comision = venta * 0.015;
                System.out.println("la venta " + i + " tiene comision de: " + comision + ". Valor de venta: " + venta);
            } else if (venta > 100000 && venta <= 250000) {
                comision = venta * 0.018;
                System.out.println("la venta " + i + " tiene comision de: " + comision + ". Valor de venta: " + venta);
            } else {
                comision = venta * 0.023;
                System.out.println("la venta " + i + " tiene comision de: " + comision + ". Valor de venta: " + venta);
            }
        }
    }
}
