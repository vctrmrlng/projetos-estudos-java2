package Prova1;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private Professor professor;
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Disciplina() {}

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        if (avaliacao != null) {
            avaliacoes.add(avaliacao);
        }
    }
}