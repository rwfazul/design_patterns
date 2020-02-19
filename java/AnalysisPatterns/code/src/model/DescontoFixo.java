/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rhau
 */
public class DescontoFixo extends Desconto {
    
    private Double valorDesconto;

    public DescontoFixo(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }
    
    /**
     * Aplica desconto no valor de uma venda
     *
     * @param Double valor total da venda (sem desconto)
     * @return valor final da venda com desconto
     * - se 'valorVenda' for menor que o necessário para aplicar o desconto, então o desconto não é aplicado e 'valorVenda' é retornado sem modificações
     */
    @Override
    public Double aplicaDesconto(Double valorVenda) {
        if (valorVenda < getLimiteInferior()) 
            return valorVenda; 
        Double valorComDesconto = valorVenda - this.valorDesconto;
        return valorComDesconto >= 0 ? valorComDesconto : valorVenda;
    }

    @Override
    public String toString() {
        return "R$" + getValorDesconto();
    }
    
}
