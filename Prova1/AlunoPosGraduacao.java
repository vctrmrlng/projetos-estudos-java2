package Prova1;

public class AlunoPosGraduacao extends Aluno {

    public AlunoPosGraduacao() {
        super();
    }

    public AlunoPosGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }

    @Override
    public double calcularMensalidade() {
        return 800.0; 
        // diferente da graduação
    }

    @Override
    public String getTipoCurso() {
        return "Pós-Graduação";
    }
}