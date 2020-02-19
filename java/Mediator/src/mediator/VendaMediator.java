/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author rhau
 */
public class VendaMediator implements Mediator {

    protected ArrayList<Colleague> colleagues;

    public VendaMediator() {
        colleagues = new ArrayList<>();
    }

    public void adicionarColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public Boolean proporOferta(Double valor, UnidadeMonetaria unidadeMonetaria, Colleague colleague) {
        DecimalFormat f = new DecimalFormat("##.00");
        Boolean ofertaAceita = false;
        
        for (Colleague contato : colleagues) {
            if (contato != colleague && contato instanceof VendedorEua) {
                Double valorEmDolar = ConversorDolar.converte(valor, unidadeMonetaria);
                ofertaAceita = contato.avaliarOferta(valorEmDolar);
                System.out.println("\t\t* a oferta de " +
                        UnidadeMonetaria.getSigla(unidadeMonetaria) + f.format(valor) + 
                        " (" + UnidadeMonetaria.getSigla(UnidadeMonetaria.DOLAR)+ f.format(valorEmDolar) + ") " +  
                        (ofertaAceita ? "foi aceita!" : "NÃO foi aceita!"));
                break;
            }
        }
        
        return ofertaAceita;
    }
    
}