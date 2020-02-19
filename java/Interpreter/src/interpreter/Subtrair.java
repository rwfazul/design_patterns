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
public class Subtrair extends Expressao {

    private Expressao left;
    private Expressao right;
    
    public Subtrair(Expressao left, Expressao right) {
        this.left = left;
        this.right = right;
    }
        
    @Override
    public Integer interpret(Contexto contexto) {
        return left.interpret(contexto) - right.interpret(contexto);
    }

    @Override
    public String toString() {
        return "(" + left + "-" + right + ')';
    }
    
}
