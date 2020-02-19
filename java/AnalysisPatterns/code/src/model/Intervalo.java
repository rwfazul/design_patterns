/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author rhau
 */
public class Intervalo {
    
    private Date inicio;
    private Date fim;

    public Intervalo(Date inicio, Date fim) throws Exception {
        if (inicio.getTime() > fim.getTime())
            throw new Exception("Data fim deve ser maior que data início.");
        this.inicio = inicio;
        this.fim = fim;
    }
    
    public Long getDiffMilliseconds() {
        return fim.getTime() - inicio.getTime();
    }
    
    public Integer getDiffDays() {
        return (int) (getDiffMilliseconds() / (24 * 60 * 60 * 1000));
    }
    
    public Integer getDiffHours() {
        return  (int) (getDiffMilliseconds() / (60 * 60 * 1000));   
    }
    
    public Integer getDiffSeconds() {
        return (int) (getDiffMilliseconds() / (1000));
    }			

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        return "Intervalo{" + "inicio=" + inicio + ", fim=" + fim + '}';
    }
    
}