/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorialrecursivo;

/**
 *
 * @author Alunos
 */
public class FatorialRecursivo {

    public static void main(String[] args) {
        FatorialRecursivo(10);
    }
    
    public static int FatorialRecursivo(int n) {
        // Caso base: fatorial de 0 ou 1 é 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva
            int resultado = n * FatorialRecursivo(n - 1);
            // Exibindo o resultado da chamada recursiva
            System.out.println("Fatorial de " + n + " e = " + resultado);
            return resultado;
        }
    }
}