/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefixacao;

/**
 *
 * @author Alunos
 */
public class Fibonacci {
    public static int Fibonacci(int posicao) {
        return Fibonacci (posicao, 2, 0, 1);
    }
    public static int Fibonacci (int pos_final, int pos_atual, int valor_atual, int valor_anterior) {
        int novo_valor = valor_atual + valor_anterior;
        System.out.println(valor_anterior + " + " + valor_atual + " = " + novo_valor);
        if (pos_atual < pos_final){
            return Fibonacci(pos_final, pos_atual + 1, novo_valor, valor_atual);
        } else{
            System.out.println("O valor da posicao #" + pos_final+ " na sequencia fibonacci e " + novo_valor);
            return novo_valor;
        }
    }
}
