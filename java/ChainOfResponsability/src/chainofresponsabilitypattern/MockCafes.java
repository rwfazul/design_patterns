/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsabilitypattern;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rhau
 */
public class MockCafes {
    
    public static Map<Integer, Cafe> CAFES;
    
    static {
        Integer idCafe = 0;
        Map<Integer, Cafe> cafes =  new HashMap<>();
        cafes.put(++idCafe, new Cafe("Espresso", 4.00));
        cafes.put(++idCafe, new Cafe("Cappuccino", 5.50));
        cafes.put(++idCafe, new Cafe("Mocha", 3.50));
        cafes.put(++idCafe, new Cafe("Lungo", 2.50));
        cafes.put(++idCafe, new Cafe("Corretto", 6.00));
        cafes.put(++idCafe, new Cafe("Irish", 4.50));
        cafes.put(++idCafe, new Cafe("Macchiato", 4.00));
        cafes.put(++idCafe, new Cafe("Latte", 5.00));
        cafes.put(++idCafe, new Cafe("Americano", 3.00));
        cafes.put(++idCafe, new Cafe("Pingado", 2.00));    
        CAFES = Collections.unmodifiableMap(cafes);
    }
    
}