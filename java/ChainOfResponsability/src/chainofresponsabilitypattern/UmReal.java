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
public class UmReal extends MoedasChain {
    
    public UmReal() {
        super(MoedasEnum.UM_REAL);
    }
    
    @Override
    protected Integer getValor() {
        System.out.println("< Moeda de 1 real inserida...");
        return MoedasEnum.getValor(tipoMoeda);
    }
        
}