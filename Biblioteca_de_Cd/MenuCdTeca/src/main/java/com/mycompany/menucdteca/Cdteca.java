/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucdteca;

/**
 *
 * @author Admin
 */
public class Cdteca {
    private String codcd;
    private String titulo;
    private String artista;
    private double preco;
    private double percentual; 
    
    
    
    
    public void cadastrarCD  (String codcd, String titulo, String artista, double preco) {
    this.artista = artista;
    this.codcd = codcd; 
    this.preco = preco;
    this.titulo = titulo;
    
    }
   
    public void cadastrarPercentual (double percentual) {
    this.percentual = percentual;
    
    }
    
    public String getcodcd() {
        return this.codcd;
    }
    
    public String gettitulo() {
        return this.titulo;
    }
    public String getartista() {
        return this.artista;
    }
    
    public double getpreco() {
        return this.preco;
    }
    public double getpercentual() {
        return this.percentual;
    }
}
