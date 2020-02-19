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
public class VinteCincoCentavos extends MoedasChain {
    
    public VinteCincoCentavos() {
        super(MoedasEnum.VINTE_CINCO_CENTAVOS);
    }
    
    @Override
    protected Integer getValor() {
        System.out.println("< Moeda de 25 centavos inserida...");
        return MoedasEnum.getValor(tipoMoeda);
    }
    
}