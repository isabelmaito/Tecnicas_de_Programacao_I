/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoveiculos;

/**
 *
 * @author Alunos
 */
public class CarroPasseio extends Veiculo {
    private int numeroPassageiros;
    private int numeroPortas;
 
    public CarroPasseio(String chassi, String marca, String modelo, String cor, int anoFabricacao, int anoModelo, int numeroPassageiros, int numeroPortas) {
        super(chassi, marca, modelo, cor, anoFabricacao, anoModelo, "Passeio");
        this.numeroPassageiros = numeroPassageiros;
        this.numeroPortas = numeroPortas;
    }
 
    // Getters e Setters
    public int getNumeroPassageiros() { return numeroPassageiros; }
    public void setNumeroPassageiros(int numeroPassageiros) { this.numeroPassageiros = numeroPassageiros; }
 
    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }
 
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Número de Portas: " + numeroPortas);
    }
}