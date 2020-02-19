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
public enum MoedasEnum {
    
    UM_CENTAVO, CINCO_CENTAVOS, DEZ_CENTAVOS, VINTE_CINCO_CENTAVOS, CINQUENTA_CENTAVOS, UM_REAL;
    
    public static Integer getValor(MoedasEnum tipoMoeda) {
        Integer valorEmCentavos = 0;
        switch (tipoMoeda) {
            case UM_CENTAVO:            
                valorEmCentavos = 1; 
                break;
            case CINCO_CENTAVOS:        
                valorEmCentavos = 5; 
                break;
            case DEZ_CENTAVOS:          
                valorEmCentavos = 10; 
                break;
            case VINTE_CINCO_CENTAVOS:  
                valorEmCentavos = 25; 
                break;
            case CINQUENTA_CENTAVOS:    
                valorEmCentavos = 50; 
                break;
            case UM_REAL:               
                valorEmCentavos = 100; 
                break;
            default:                    
                valorEmCentavos = 0;
        }
        return valorEmCentavos;
    }

    static MoedasEnum getMoeda(Double valor) throws Exception {
        if (valor.equals(0.01))
            return UM_CENTAVO;
        if (valor.equals(0.05))
            return CINCO_CENTAVOS;
        if (valor.equals(0.1))
            return DEZ_CENTAVOS;
        if (valor.equals(0.25))
            return VINTE_CINCO_CENTAVOS;
        if (valor.equals(0.50))
            return CINQUENTA_CENTAVOS;
        if (valor.equals(1.0))
            return UM_REAL;
        throw new Exception("< Insira uma moeda válida");
    }
    
}