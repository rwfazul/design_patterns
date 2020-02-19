/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsabilitypattern;

import java.util.Scanner;

/**
 *
 * @author rhau
 */
public class CoffeeMachine {
    
    private MoedasChain slotsMoedas;
    private Integer valorAcumulado;
    private Cafe cafeSelecionado;
    
    public CoffeeMachine() {
        inicializaMaquina();
    }
    
    private void acumulaValor(Integer soma) {
        this.valorAcumulado += soma;
    }
    
    public Integer getValorAcumulado() {
        return valorAcumulado;
    }
    
    public void adicionaMoeda(MoedasEnum tipoMoeda) throws Exception {
        if (this.cafeSelecionado == null) 
            throw new Exception("O café deve ser selecionado antes da inserção de moedas.");
        Integer valorInserido = this.slotsMoedas.adicionarMoeda(tipoMoeda);
        acumulaValor(valorInserido);
        System.out.println("\t* Valor acumulado: " + getValorAcumulado() + " centavos (faltam " + calculaRestante() + " centavos)");
        if (getValorAcumulado() >= this.cafeSelecionado.getValorEmCentavos()) {
            System.out.println("< Café dispensado: " + this.cafeSelecionado.getNome());
            dispensaTroco();
        }
    }

    private void inicializaMaquina() {
        this.slotsMoedas = new UmCentavo();
        slotsMoedas.setNext(new CincoCentavos());
        slotsMoedas.setNext(new DezCentavos());
        slotsMoedas.setNext(new VinteCincoCentavos());
        slotsMoedas.setNext(new CinquentaCentavos());
        slotsMoedas.setNext(new UmReal());
        this.valorAcumulado = 0;
        this.cafeSelecionado = null;
    }
    
    public void exibeMenu() {
        Scanner in = new Scanner(System.in);
        Boolean opcaoValida = false;
        System.out.println("\t*** Coffe Machine ***");
        do {
            System.out.println("[Id]\t\t[Valor]\t\t[Nome]");
            MockCafes.CAFES.entrySet().forEach((entry) -> {
                System.out.println(String.format("%2d", entry.getKey()) + "\t\t" + entry.getValue().toString());
            });
            System.out.print("> Selecione uma opção: ");
            try {
                Integer idCafe = in.nextInt();
                opcaoValida = selecionaCafe(idCafe);
            } catch (Exception ex) {
                System.out.println("*** Valor inválido (deve ser um identificador de café válido) ***\n");
                in.nextLine();
            }
        } while ( !opcaoValida );
    }
    
    private Boolean selecionaCafe(Integer idCafe) {
        Boolean opcaoValida = false;
        if (MockCafes.CAFES.keySet().contains(idCafe)) {
            setCafeSelecionado(MockCafes.CAFES.get(idCafe));
            System.out.println("< Item " + idCafe + " escolhido (" + this.cafeSelecionado.getNome() 
                + "): R$ " + String.format("%1.2f", this.cafeSelecionado.getValor())
                + " ("+ this.cafeSelecionado.getValorEmCentavos() + " centavos)");
            System.out.println("\n<  Insira moedas...:");
            opcaoValida = true;
        } else
            System.out.println("< Opção inválida. Selecione um café dentre os disponíveis.\n");
        return opcaoValida;
    }
   
    private void dispensaTroco() {
        System.out.print("< Troco: " + (this.getValorAcumulado() - this.cafeSelecionado.getValorEmCentavos()) + " centavos\n");
        this.valorAcumulado = 0;
        this.cafeSelecionado = null;
    }

    private Integer calculaRestante() {
        Integer restante = (this.cafeSelecionado.getValorEmCentavos() - this.getValorAcumulado());
        return restante >= 0 ? restante: 0;
    }
    
    public Cafe getCafeSelecionado() {
        return cafeSelecionado;
    }

    private void setCafeSelecionado(Cafe cafeSelecionado) {
        this.cafeSelecionado = cafeSelecionado;
    }
    
}