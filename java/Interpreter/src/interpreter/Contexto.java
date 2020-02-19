/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.Map;

/**
 *
 * @author rhau
 */
public class Contexto {
    
    private Map<Character, Integer> variaveisMap;

    public Contexto(Map<Character, Integer> variaveisMap) {
        this.variaveisMap = variaveisMap;
    }

    public Map<Character, Integer> getVariaveisMap() {
        return variaveisMap;
    }

    public void setVariaveisMap(Map<Character, Integer> variaveisMap) {
        this.variaveisMap = variaveisMap;
    }
    
    public Integer getVariableValue(Character key) {
        return this.variaveisMap.get(key);
    }
    
    public Boolean IsVariableMapped(Character key) {
        return this.variaveisMap.containsKey(key);
    }

}
