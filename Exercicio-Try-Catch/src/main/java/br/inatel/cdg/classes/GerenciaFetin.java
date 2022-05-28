package br.inatel.cdg.classes;

import br.inatel.cdg.excecoes.NotaInsuficienteException;

import java.util.HashMap;

public class GerenciaFetin {
    HashMap<String, Double> projetos = new HashMap<String, Double>();

    public void addProjeto(Fetin projetoFetin){
        try{
            projetos.put(projetoFetin.getTitulo(), projetoFetin.getPontuacao());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public void listaProjetos() {
        projetos.forEach((titulo, pontuacao) -> {
            try{
                if(pontuacao >= 60.00){
                    System.out.println("Título: " + titulo + " - pontuação: " + pontuacao);
                } else{
                    throw new NotaInsuficienteException("A nota do seu projeto não é suficiente");
                }
            } catch (NotaInsuficienteException e){
                System.out.println(e.getMessage());
            }
        });
    }
}
