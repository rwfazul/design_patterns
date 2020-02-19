/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cidade;
import model.Estado;
import model.Ingresso;
import model.Intervalo;
import model.Local;
import model.Pessoa;
import model.Evento;

/**
 *
 * @author rhau
 */
public class MockDados {

    public static HashMap<String, Estado> ESTADOS = new HashMap<>() ;
    public static List<Cidade> CIDADES = new ArrayList<>();
    public static List<Local> LOCAIS = new ArrayList<>();
    public static List<Pessoa> PESSOAS = new ArrayList<>();
    public static List<Evento> EVENTOS = new ArrayList<>();
    
    static {
        criaEstados();
        criaCidades();
        criaLocais();
        criaPessoas();
        criaEventos();
        criaIngressos();
    }
    
    private static void criaEstados() {
        ESTADOS.put("RS", new Estado("Rio Grande do Sul", "RS"));
        ESTADOS.put("SC", new Estado("Santa Catarina", "SC"));
        ESTADOS.put("PR", new Estado("Paraná", "PR"));
        ESTADOS.put("SP", new Estado("São Paulo", "SP"));
        ESTADOS.put("RJ", new Estado("Rio de Janeiro", "RJ"));
    }

    private static void criaCidades() {
        CIDADES.add(new Cidade("Santa Maria", ESTADOS.get("RS")));
        CIDADES.add(new Cidade("Porto Alegre", ESTADOS.get("RS")));
        CIDADES.add(new Cidade("Florianópolis", ESTADOS.get("SC")));
        CIDADES.add(new Cidade("Curitiba", ESTADOS.get("PR")));
        CIDADES.add(new Cidade("São Paulo", ESTADOS.get("SP")));
        CIDADES.add(new Cidade("Rio De Janeiro", ESTADOS.get("RJ")));        
    }

    private static void criaLocais() {
        LOCAIS.add(new Local("Rua Exemplo 1", "Bairo Exemplo 1", 10, CIDADES.get(0)));
        LOCAIS.add(new Local("Rua Exemplo 2", "Bairo Exemplo 2", 10, CIDADES.get(1)));
        LOCAIS.add(new Local("Rua Exemplo 3", "Bairo Exemplo 3", 10, CIDADES.get(2)));
        LOCAIS.add(new Local("Rua Exemplo 4", "Bairo Exemplo 4", 10, CIDADES.get(3)));
        LOCAIS.add(new Local("Rua Exemplo 5", "Bairo Exemplo 5", 10, CIDADES.get(4)));
    }

    private static void criaPessoas() {
        PESSOAS.add(new Pessoa("Cliente 1", "111.111.111/11", LOCAIS.get(0)));
        PESSOAS.add(new Pessoa("Cliente 2", "222.222.222/22", LOCAIS.get(1)));
        PESSOAS.add(new Pessoa("Cliente 3", "333.333.333/33", LOCAIS.get(2)));
        PESSOAS.add(new Pessoa("Cliente 4", "444.444.444/44", LOCAIS.get(3)));
        PESSOAS.add(new Pessoa("Cliente 5", "555.555.555/55", LOCAIS.get(4)));
    }
    private static void criaEventos() {
        Date dataAtual = new Date(System.currentTimeMillis());
        Integer dayInMilliSec = 1000 * 60 * 60 * 24;
        try {
            EVENTOS.add(new Evento("Evento 1", new Intervalo(dataAtual, new Date(dataAtual.getTime() + dayInMilliSec)), LOCAIS.get(0)));
            EVENTOS.add(new Evento("Evento 2", new Intervalo(dataAtual, new Date(dataAtual.getTime() + dayInMilliSec * 2)), LOCAIS.get(1)));
            EVENTOS.add(new Evento("Evento 3", new Intervalo(dataAtual, new Date(dataAtual.getTime() + dayInMilliSec * 3)), LOCAIS.get(2)));
            EVENTOS.add(new Evento("Evento 4", new Intervalo(dataAtual, new Date(dataAtual.getTime() + dayInMilliSec * 4)), LOCAIS.get(3)));
            EVENTOS.add(new Evento("Evento 5", new Intervalo(dataAtual, new Date(dataAtual.getTime() + dayInMilliSec * 5)), LOCAIS.get(4)));
        } catch (Exception ex) {
            Logger.getLogger(MockDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void criaIngressos() {
        // cria 100 ingressos para cada evento
        for (int i = 0; i < 100; i++) {
            EVENTOS.get(0).getIngressos().add(new Ingresso(i + 1, 100.0, EVENTOS.get(0)));
            EVENTOS.get(1).getIngressos().add(new Ingresso(i + 1, 100.0, EVENTOS.get(1)));
            EVENTOS.get(2).getIngressos().add(new Ingresso(i + 1, 100.0, EVENTOS.get(2)));
            EVENTOS.get(3).getIngressos().add(new Ingresso(i + 1, 100.0, EVENTOS.get(3)));
            EVENTOS.get(4).getIngressos().add(new Ingresso(i + 1, 100.0, EVENTOS.get(4)));
        }    
    }
    
}
