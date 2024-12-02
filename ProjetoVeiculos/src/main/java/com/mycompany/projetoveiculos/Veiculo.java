/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoveiculos;

/**
 *
 * @author Alunos
 */

public class Veiculo {
    private String chassi;
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private String tipo;
 
    public Veiculo(String chassi, String marca, String modelo, String cor, int anoFabricacao, int anoModelo, String tipo) {
        this.chassi = chassi;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.tipo = tipo;
    }
 
    // Getters e Setters
    public String getChassi() { return chassi; }
    public void setChassi(String chassi) { this.chassi = chassi; }
 
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
 
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
 
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
 
    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }
 
    public int getAnoModelo() { return anoModelo; }
    public void setAnoModelo(int anoModelo) { this.anoModelo = anoModelo; }
 
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
 
    public void exibirInformacoes() {
        System.out.println("Chassi: " + chassi);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Ano do Modelo: " + anoModelo);
        System.out.println("Tipo: " + tipo);
    }
}

