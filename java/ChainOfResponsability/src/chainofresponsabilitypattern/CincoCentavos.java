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
public class CincoCentavos extends MoedasChain {
 
    public CincoCentavos() {
        super(MoedasEnum.CINCO_CENTAVOS);
    }

    @Override
    protected Integer getValor() {
        System.out.println("< Moeda de 5 centavos inserida...");
        return MoedasEnum.getValor(tipoMoeda);
    }
    
}