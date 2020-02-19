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
public class CompradorBrasil extends Colleague {

    public CompradorBrasil(Mediator mediator) {
        super(mediator);
    }

    @Override
    public Boolean avaliarOferta(Double valor) {
        System.out.println(this.getClass().getName() + " não está vendendo nada!");
        return null;
    }

}