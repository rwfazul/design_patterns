/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author rhau
 */
public class Variavel extends Expressao {
   
    private Character key;
   
    public Variavel(Character key) {
        this.key = key;
    }
    
    @Override
    public Integer interpret(Contexto contexto) {
        return contexto.getVariableValue(this.key);
    }

    @Override
    public String toString() {
        return key.toString();
    }
    
}
