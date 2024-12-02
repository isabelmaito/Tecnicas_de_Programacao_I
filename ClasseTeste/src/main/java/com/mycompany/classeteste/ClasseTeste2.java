/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeteste;

/**
 *
 * @author Isabel
 */
public class ClasseTeste2 {
    int numero;
    int numero2;
    
    public ClasseTeste2(int numero){
        super();
        this.numero = numero;
    }
    public ClasseTeste2(int numero, int numero2){
        super();
        this.numero = numero;
        this.numero2 = numero2;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero2(){
        return numero2;
    }
    public void setNumero2(int numero){
        this.numero2 = numero2;
    }
}