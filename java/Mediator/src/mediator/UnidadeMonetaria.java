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
public enum UnidadeMonetaria {
 
    REAL, EURO, DOLAR;
    
    public static String getSigla(UnidadeMonetaria unidadeMonetaria) {
        if ( unidadeMonetaria.equals(UnidadeMonetaria.EURO) )
            return "€";
        if ( unidadeMonetaria.equals(UnidadeMonetaria.REAL) )
            return "R$";
        if ( unidadeMonetaria.equals(UnidadeMonetaria.DOLAR) )
            return "US$";
        return null;
    }
    
}