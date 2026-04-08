package Prova1;

import java.util.ArrayList;
import java.util.List;

public abstract class Aluno extends Pessoa {
	private List<MatriculaDisciplina> matriculas = new ArrayList<>();
	// MatriculaDisciplina é lista e não array, pq o tamanho é variavel.

    public Aluno() {
        super();
    }

    public Aluno(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, telefone, email, endereco, matricula);
    }

    public void inscreverDisciplina(Disciplina disciplina) {
        if (disciplina != null) {
            MatriculaDisciplina md = new MatriculaDisciplina(this, disciplina);
            matriculas.add(md);
        }
    }
    
    
	public Boleto solicitarBoleto() {
        return new Boleto(this.getNome(), calcularMensalidade());
    }

	public Historico solicitarHistorico() {
	    List<Disciplina> disciplinas = new ArrayList<>();

	    for (MatriculaDisciplina m : matriculas) {
	        disciplinas.add(m.getDisciplina());
	    }

	    return new Historico(this.getNome(), disciplinas);
	}

	public List<MatriculaDisciplina> getMatriculas() {
	    return matriculas;
	}

    public abstract double calcularMensalidade();

    public abstract String getTipoCurso();
}
