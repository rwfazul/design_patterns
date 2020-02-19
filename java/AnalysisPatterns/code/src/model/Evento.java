/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rhau
 */
public class Evento {
    
    private String nome;
    private Intervalo intervalo;
    private Local local;
    private List<Ingresso> ingressos = new ArrayList<>();
    
    public Evento() {
    }

    public Evento(String nome, Intervalo intervalo, Local local) {
        this.nome = nome;
        this.intervalo = intervalo;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Intervalo getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(Intervalo intervalo) {
        this.intervalo = intervalo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", intervalo=" + intervalo + ", local=" + local + '}';
    }

}