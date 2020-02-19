/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rhau
 */
public class Cliente {
    
    public static void main(String[] args) { 
        /* cria contexto (mapa de variaveis) */
        Map<Character, Integer> variaveisMap = new HashMap<>();
        variaveisMap.put('x', 5);
        variaveisMap.put('y', 2);
        variaveisMap.put('z', 3);
        variaveisMap.put('a', 4);
     
        Contexto contexto = new Contexto(variaveisMap); 
        
        /* estrutura expressão, e.g. input =  (((x - y) + z) - a)) */
        Expressao expr = new Subtrair(new Variavel('x'), new Variavel('y')); // (x - y)
        expr = new Somar(expr, new Variavel('z')); // ((x - y) + z)
        expr = new Subtrair(expr, new Variavel('a')); // (((x - y) + z) - a)
            
        /* resolve expressão */
        System.out.println("Operação: " + expr.toString());
        System.out.println("Resultado: " + expr.interpret(contexto));
    }
    
}
