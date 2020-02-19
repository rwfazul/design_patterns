/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author rhau
 */
public class VendedorEua extends Colleague {

    private Double valorItem;
    
    public VendedorEua(Mediator mediator) {
        super(mediator);
    }
    
    public VendedorEua(Mediator mediator, Double valorItem) {
        super(mediator);
        this.valorItem = valorItem;
    }
    
    @Override
    public Boolean avaliarOferta(Double valor) {
        return valor >= getValorItem();
    }

    public Double getValorItem() {
        return valorItem;
    }

    public void setValorItem(Double valorItem) {
        this.valorItem = valorItem;
    }
    
}