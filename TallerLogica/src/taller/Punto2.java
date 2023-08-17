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
public class Punto2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        double base = read.nextDouble();
        System.out.println();
        System.out.println("Ingrese la altura: ");
        double h = read.nextDouble();
        System.out.println();

        System.out.println("El perimetro es igual a: " + perimeter(h, base) + " unidades");
        System.out.println("El area es igual a: " + area(h, base) + " unidades cuadradas");
    }

    //funcion perimetro
    public static double perimeter(double h, double base) {
        return ((2 * h) + (2 * base));
    }

    //funcio para el area
    public static double area(double h, double base) {
        return h * base;
    }
}
