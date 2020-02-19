/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rhau
 */
public class Ingresso {
    
    private Integer numero;
    private Double valor;
    private Evento evento;

    public Ingresso(Integer numero, Double valor, Evento evento) {
        this.numero = numero;
        this.valor = valor;
        this.evento = evento;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Ingresso{" + "numero=" + numero + ", valor=" + valor + ", show=" + evento + '}';
    }

}