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
public class DescontoPercentual extends Desconto {

    private Double percentualDesconto = 0.0;

    public DescontoPercentual(Double percentualDesconto) {
        if (percentualDesconto <= 100.0) // desconto máximo
            this.percentualDesconto = percentualDesconto;
    }
    
    public Double getPercentualDesconto() {
        return percentualDesconto;
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
        Double descontoPonderado = 1 - (getPercentualDesconto() / 100.0);
        return valorVenda < getLimiteInferior() ? valorVenda : valorVenda * descontoPonderado;
    }

    @Override
    public String toString() {
        return getPercentualDesconto() + "%";
    }   
    
}
