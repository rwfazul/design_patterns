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
public abstract class Colleague {
    
    protected Mediator mediator;
    
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
   
    public Boolean realizarOferta(Double valor, UnidadeMonetaria unidadeMonetaria) {
        System.out.println("Comprador está propondo " + UnidadeMonetaria.getSigla(unidadeMonetaria) + valor);
        return mediator.proporOferta(valor, unidadeMonetaria, this);
    }

    public abstract Boolean avaliarOferta(Double valor);

}
