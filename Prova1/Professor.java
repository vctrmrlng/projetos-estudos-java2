package Prova1;

public class Professor extends Pessoa {

    public Professor() {
        super();
    }

    public Professor(String nome, String cpf, String telefone, String email, String endereco, String matricula) {
        super(nome, cpf, telefone, email, endereco, matricula);
    }

    public void lancarNota(Avaliacao avaliacao, double nota) {
        if (avaliacao != null) {
            avaliacao.setNota(nota);
        }
    }

    public void lancarFrequencia(MatriculaDisciplina matricula, double frequencia) {
        if (matricula != null) {
            matricula.setFrequencia(frequencia);
        }
    }
}	