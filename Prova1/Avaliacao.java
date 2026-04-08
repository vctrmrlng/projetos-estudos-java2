package Prova1;

public class Avaliacao {

    private String descricao;
    private double nota;

    public Avaliacao() {}

    public Avaliacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
// Eu criei esse atributo descrição para dizer se é a primeira prova ou a segunda, se é oral, escrita, multipla escolha. 
// Poderiam ser mais atributo como bimestre, tipo de prova, etc... mas para simplificar deixei assim mesmo.