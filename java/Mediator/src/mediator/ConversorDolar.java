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
public class ConversorDolar {

    private static final Double EURO_IN_DOLAR = 1.10; 
    private static final Double REAL_IN_DOLAR = 0.24;    
    
    public static Double converte(Double valor, UnidadeMonetaria unidadeMonetaria) {
        if ( unidadeMonetaria.equals(UnidadeMonetaria.EURO) )
            return valor * EURO_IN_DOLAR;
        if ( unidadeMonetaria.equals(UnidadeMonetaria.REAL) )
            return valor * REAL_IN_DOLAR;
        if ( unidadeMonetaria.equals(UnidadeMonetaria.DOLAR) )
            return valor;
        return null;    
    }
    
}