/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoveiculos;

/**
 *
 * @author Alunos
 */

public class Onibus extends Veiculo {
    private int numeroPassageiros;
    private boolean linhaUrbana;
 
    public Onibus(String chassi, String marca, String modelo, String cor, int anoFabricacao, int anoModelo, int numeroPassageiros, boolean linhaUrbana) {
        super(chassi, marca, modelo, cor, anoFabricacao, anoModelo, "Transporte de Pessoas");
        this.numeroPassageiros = numeroPassageiros;
        this.linhaUrbana = linhaUrbana;
    }
 
    // Getters e Setters
    public int getNumeroPassageiros() { return numeroPassageiros; }
    public void setNumeroPassageiros(int numeroPassageiros) { this.numeroPassageiros = numeroPassageiros; }
 
    public boolean isLinhaUrbana() { return linhaUrbana; }
    public void setLinhaUrbana(boolean linhaUrbana) { this.linhaUrbana = linhaUrbana; }
 
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Linha Urbana: " + (linhaUrbana ? "Sim" : "Não"));
    }
}

