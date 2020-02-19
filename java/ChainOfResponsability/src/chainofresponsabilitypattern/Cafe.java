/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsabilitypattern;

/**
 *
 * @author rhau
 */
public class Cafe {
    
    private String nome;
    private Double valor;

    public Cafe(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Double getValor() {
        return this.valor;
    }

    public Integer getValorEmCentavos() {
        Double centavos = this.valor * 100.0;
        return centavos.intValue();
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "R$ " + String.format("%1.2f", valor) + "\t\t" + nome;
    }
    
}