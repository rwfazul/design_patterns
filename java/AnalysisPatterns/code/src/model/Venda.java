/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author rhau
 */
public final class Venda {
    
    private Pessoa pessoa;
    private Collection<Ingresso> ingressos;
    private Desconto desconto;

    public Venda() {
        this.ingressos = new ArrayList<>();
    }
    
    public Venda(Pessoa pessoa, Collection<Ingresso> ingressos, Desconto desconto) {
        this.pessoa = pessoa;
        this.ingressos = ingressos;
        this.desconto = desconto;
    }
    
    public Double getValorFinal() {
        Double valorTotalIngressos = 0.0;
        // calcula valor total da venda (somatório do valor individual de cada ingresso)
        valorTotalIngressos = ingressos
                                .stream()
                                .map((i) -> i.getValor())
                                .reduce(valorTotalIngressos, (accumulator, _item) -> accumulator + _item);
        // se venda possui um desconto, o desconto é aplicadol
        if (desconto != null)
            return desconto.aplicaDesconto(valorTotalIngressos);
        // se não possui desconto, retorna-se o valor de venda original
        return valorTotalIngressos;
    }
    
    public Double getValorSemDesconto() {
        Double valorSemDesconto = 0.0;
        valorSemDesconto = ingressos.stream().map((i) -> i.getValor()).reduce(valorSemDesconto, (accumulator, _item) -> accumulator + _item);
        return valorSemDesconto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Collection<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(Collection<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        String strVenda = "Venda{";
        strVenda += "\n\tvalorFinal=" + getValorFinal();
        strVenda += "\n\tvalorSemDesconto=" + getValorSemDesconto() + " (desconto=" + desconto + ")";
        strVenda += "\n\tcomprador=" + pessoa;
        strVenda += "\n\tingressos={\n";
        strVenda = ingressos.stream().map((i) -> "\t\t" + i + "\n").reduce(strVenda, String::concat); 
        strVenda += "\t}\n}";
        return strVenda;
    }
    
}