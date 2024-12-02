/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoveiculos;

/**
 *
 * @author Alunos
 */
public class ProjetoVeiculos {

    public static void main(String[] args) {
        Veiculo carro = new CarroPasseio("ABC1234", "Toyota", "Corolla", "Prata", 2022, 2023, 5, 4);
        Veiculo caminhao = new Caminhao("DEF5678", "Scania", "R450", "Azul", 2021, 2022, 20.5, "Carreta");
        Veiculo onibus = new Onibus("GHI9012", "Mercedes", "O500", "Verde", 2020, 2021, 40, true);
        // exibindo informações de apenas um atributo do veículo carro
        System.out.println("-Ano de fabricacao do carro: "+carro.getAnoFabricacao());
            carro.exibirInformacoes();        
        System.out.println("-Ano de fabricacao do caminhao: "+caminhao.getAnoFabricacao());
            caminhao.exibirInformacoes();        
        System.out.println("-Ano de fabricacao do onibus: "+onibus.getAnoFabricacao());
            onibus.exibirInformacoes();
        // exibindo todas as informações dos atributos do veículo carro           
        // fazer a exibição de todas as informações de cada classe (carro, caminhao e onibus)
        // mostrando cada um dos atributos separados e depois mostrando todas as informações de cada veículo
   }
}