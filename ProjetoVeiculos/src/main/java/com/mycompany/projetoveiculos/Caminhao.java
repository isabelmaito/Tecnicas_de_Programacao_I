/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoveiculos;

/**
 *
 * @author Alunos
 */
public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private String tipoCarreta;
 
    public Caminhao(String chassi, String marca, String modelo, String cor, int anoFabricacao, int anoModelo, double capacidadeCarga, String tipoCarreta) {
        super(chassi, marca, modelo, cor, anoFabricacao, anoModelo, "Carga");
        this.capacidadeCarga = capacidadeCarga;
        this.tipoCarreta = tipoCarreta;
    }
 
    // Getters e Setters
    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }
 
    public String getTipoCarreta() { return tipoCarreta; }
    public void setTipoCarreta(String tipoCarreta) { this.tipoCarreta = tipoCarreta; }
 
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
        System.out.println("Tipo de Carreta: " + tipoCarreta);
    }
}
