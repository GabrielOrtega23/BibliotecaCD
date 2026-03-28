/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucdteca;

/**
 *
 * @author Admin
 */
public class VendaCD {
    private double valorcd;
   
    
    
    
    public void calcularPrecoVenda (Cdteca p){
        valorcd = p.getpreco() + (p.getpreco() * p.getpercentual() / 100);
    }

public double getvalorcd() {
  return this.valorcd; 
}
}
