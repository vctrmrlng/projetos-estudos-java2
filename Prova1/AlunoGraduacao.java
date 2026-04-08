package Prova1;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao() {
        super();
    }

    public AlunoGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }

    @Override
    public double calcularMensalidade() {
        return 500.0; 
        // valor fixo simples pra prova
    }

    @Override
    public String getTipoCurso() {
        return "Graduação";
    }
}