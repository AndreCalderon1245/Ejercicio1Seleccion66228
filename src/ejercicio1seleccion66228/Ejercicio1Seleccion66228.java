/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion66228;

import java.util.Scanner;
/**
 *
 * @author Mini
 */
public class Ejercicio1Seleccion66228 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("El mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("El mayor es: " + n3);
        }
    }
    }
    
