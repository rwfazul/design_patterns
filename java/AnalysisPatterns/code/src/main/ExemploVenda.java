/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collection;
import model.Desconto;
import model.DescontoFixo;
import model.DescontoPercentual;
import model.Evento;
import model.Ingresso;
import model.Pessoa;
import model.Venda;

/**
 *
 * @author rhau
 */
public class ExemploVenda {
        
    public static void main(String[] args) {       
        Evento e1 = MockDados.EVENTOS.get(0);
        Evento e2 = MockDados.EVENTOS.get(1);
        Evento e3 = MockDados.EVENTOS.get(2);
        
        Pessoa p1 = MockDados.PESSOAS.get(0);
        Pessoa p2 = MockDados.PESSOAS.get(1);
        Pessoa p3 = MockDados.PESSOAS.get(2);
    
        System.out.println("*** Realizando venda1... ***");
        // realiza uma venda (de 4 ingressos de R$ 100,00 cada do evento 1) sem desconto 
        Collection<Ingresso> ingressosVenda1 = new ArrayList<>();
        ingressosVenda1.add(e1.getIngressos().get(0));  // get(numeroIngresso)
        ingressosVenda1.add(e1.getIngressos().get(1));
        ingressosVenda1.add(e1.getIngressos().get(2));
        ingressosVenda1.add(e1.getIngressos().get(3));
        Venda v1 = new Venda(p1, ingressosVenda1, null);
        System.out.println(v1);
        
        System.out.println("\n*** Realizando venda2... ***");
        // realiza uma venda (de 4 ingressos de R$ 100,00 cada do evento 2) com desconto em porcentagem (de 10%)
        Collection<Ingresso> ingressosVenda2 = new ArrayList<>();
        ingressosVenda2.add(e2.getIngressos().get(10)); 
        ingressosVenda2.add(e2.getIngressos().get(11));
        ingressosVenda2.add(e2.getIngressos().get(12));
        ingressosVenda2.add(e2.getIngressos().get(13));
        Desconto d2 = new DescontoPercentual(10.0);
        d2.setLimiteInferior(400.0); // valor minimo da venda para aplicar desconto (se mudar para 400 > desconto não vai ser aplicado)
        Venda v2 = new Venda(p2, ingressosVenda2, d2);
        System.out.println(v2);        
        
        System.out.println("\n*** Realizando venda3... ***");
        // realiza uma venda (de 4 ingressos de R$ 100,00 cada do evento 3) com desconto fixo (de R$ 100,00)
        Collection<Ingresso> ingressosVenda3 = new ArrayList<>();
        ingressosVenda3.add(e3.getIngressos().get(20)); 
        ingressosVenda3.add(e3.getIngressos().get(21));
        ingressosVenda3.add(e3.getIngressos().get(22));
        ingressosVenda3.add(e3.getIngressos().get(23));
        Desconto d3 = new DescontoFixo(100.0);
        d3.setLimiteInferior(400.0); // valor minimo da venda para aplicar desconto (se mudar para 400 > desconto não vai ser aplicado)
        Venda v3 = new Venda(p3, ingressosVenda3, d3);
        System.out.println(v3);      
        
        System.out.println("\n\n*** Obtendo duração dos eventos... ***");
        // verifica a duração (em dias) dos eventos
        System.out.println("Duração evento 1: " + e1.getIntervalo().getDiffDays() + " dia");
        System.out.println("Duração evento 2: " + e2.getIntervalo().getDiffDays() + " dias");
        System.out.println("Duração evento 3: " + e3.getIntervalo().getDiffDays() + " dias");
    }
    
}