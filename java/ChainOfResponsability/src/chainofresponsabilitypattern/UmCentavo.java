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
public class UmCentavo extends MoedasChain {
     
    public UmCentavo() {
        super(MoedasEnum.UM_CENTAVO);
    }
    
    @Override
    protected Integer getValor() {
        System.out.println("< Moeda de 1 centavo inserida...");
        return MoedasEnum.getValor(tipoMoeda);
    }
    
}