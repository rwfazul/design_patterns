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
public class Aplicativo {
    
    public static void main(String[] args) {
        VendaMediator mediator = new VendaMediator();
	
        CompradorBrasil compradorBrasil = new CompradorBrasil(mediator);
        CompradorFranca compradorFranca = new CompradorFranca(mediator);
        VendedorEua vendedorEua = new VendedorEua(mediator, 10.0);
        System.out.println("-> Items do VendedorEua a venda por " + UnidadeMonetaria.getSigla(UnidadeMonetaria.DOLAR) + vendedorEua.getValorItem());
        
        mediator.adicionarColleague(compradorBrasil);
        mediator.adicionarColleague(compradorFranca);
        mediator.adicionarColleague(vendedorEua);

        Boolean ofertaAceita;
                
        System.out.println("\n*** CompradorBrasil ***");       
        Integer count = 0;
        Double valorInicial = 12.0;
        Double incremento = 3.0;
        do {
            System.out.print("\tOferta " + (++count) + ": ");
            ofertaAceita = compradorBrasil.realizarOferta(valorInicial, UnidadeMonetaria.REAL);
            valorInicial += incremento;
        } while ( !ofertaAceita );
        System.out.println("\t*** Compra finalizada ***");        
        
        
        System.out.println("\n*** CompradorFranca ***");
        count = 0;
        valorInicial = 3.0;
        incremento = 1.5;
        do {
            System.out.print("\tOferta " + (++count) + ": ");
            ofertaAceita = compradorFranca.realizarOferta(valorInicial, UnidadeMonetaria.EURO);
            valorInicial += incremento;
        } while ( !ofertaAceita );
        System.out.println("\t*** Compra finalizada ***");    
    }
    
}