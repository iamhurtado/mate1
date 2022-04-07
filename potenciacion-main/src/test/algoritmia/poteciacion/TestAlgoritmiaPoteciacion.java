/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.algoritmia.poteciacion;

import java.util.Scanner;

/**
 *
 * @author mmast
 */
public class TestAlgoritmiaPoteciacion {
    static int base, exponente, potencia, multiplo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        //Instancio la clase Sanner
        Scanner scanner = new Scanner(System.in);

        //Se solicita digitar el numero base
        System.out.println("Digite el número base: ");
        base = scanner.nextInt();

        //Se solicita digitar el numero exponente
        System.out.println("Digite el número exponente: ");
        exponente = scanner.nextInt();

        calcularPotencia(base, exponente);
    }
    
    public static int calcularMultiplo(int b, int e) {
      multiplo = 1;
      for(int i = 0; i < e; i++)
      {
        multiplo *= b;
      }

      return multiplo;
    }

    //Calcula la potenciacion del numero. Recibe b=base y m=multiplo de b
    public static void calcularPotencia(int b, int e) {
      calcularMultiplo(b, e);
      
      for(int i = 0; i<multiplo/b; i++)
      {
        potencia += b;
      }

      System.out.println(b + " elevado a "+ e + " es igual a: " + potencia);
    }
    
}
