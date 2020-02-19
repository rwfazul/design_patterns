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
public abstract class MoedasChain {
    
    protected MoedasChain next;
    protected MoedasEnum tipoMoeda;

    public MoedasChain(MoedasEnum tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
        next = null;
    }

    public void setNext(MoedasChain prox) {
        if (this.next == null) 
            this.next = prox;
        else
            this.next.setNext(prox);
    }

    public Integer adicionarMoeda(MoedasEnum tipoMoeda) throws Exception {
        if ( slotCompativel(tipoMoeda) )
            return getValor();
        if (this.next == null) 
            throw new Exception("Moeda inválida");
        return next.adicionarMoeda(tipoMoeda);
    }

    private boolean slotCompativel(MoedasEnum tipoMoeda) {
        return tipoMoeda.equals(this.tipoMoeda);
    }

    protected abstract Integer getValor();

}