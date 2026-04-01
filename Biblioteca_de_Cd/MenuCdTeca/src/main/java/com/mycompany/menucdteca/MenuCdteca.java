/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucdteca;

/**
 *
 * @author Admin
 */
public class MenuCdteca {
    private VendaCD vcd;
    private Cdteca cdteca;
    private int opçao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    
    public MenuCdteca() {
    this.vcd = new VendaCD();
    this.cdteca = new Cdteca();
    this.opçao = -1;
    this.conversor = new ConversorNumeros();
    this.io = new EntradaSaidaDados();
}
    public void executarCdteca() {
          do {
            this.executarMenuPrincipal();      
            this.avaliarOpcaoEscolhida();     
        } while (this.opçao != 0);
    }
    private void executarMenuPrincipal() {
        String mensagemMenu = "selecione uma opção"
           + "\n 1  - Cadastrar CD"
           + "\n 2  - Cadastrar Percentual de Venda do CD"   
           + "\n 3 - Consultar CD e Preço de Venda"
           + "\n 0 - Sair";
          
           
           
         String entradaDados = io.entradaDados(mensagemMenu);
         this.opçao = conversor.StringToInt (entradaDados);
        
    }
    private void avaliarOpcaoEscolhida() {
        switch(this.opçao) {
          
            case 1 :
                String codcd = io.entradaDados("Código:");
                String titulo = io.entradaDados("Título:");
                String artista = io.entradaDados("Artista:");
                Double preco = conversor.stringToDouble(io.entradaDados("Preço :"));
                cdteca.cadastrarCD(codcd, titulo, artista, preco);
                break;
                
            case 2 :
                double percentual = conversor.stringToDouble(io.entradaDados("Percentual: "));
               cdteca.cadastrarPercentual(percentual);
                
            
                break;
            case 3:
                io.saidaDados(
                " \n Código:  " + cdteca.getcodcd() +
                " \n Titulo:  " + cdteca.gettitulo() +
                " \n Artista:  " + cdteca.getartista() +
                " \n Preço:  " + cdteca.getpreco() +
                " \n Valor cd" + vcd.getvalorcd() 
                );
                break;
            default: 
                io.saidaDados("Opção Inválida");
                break;
                }
    }
  }

