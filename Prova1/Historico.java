package Prova1;
import java.util.List;

public class Historico {

    private String nomeAluno;
    private List<Disciplina> disciplinas;

    public Historico(String nomeAluno, List<Disciplina> disciplinas) {
        this.nomeAluno = nomeAluno;
        this.disciplinas = disciplinas;
    }
        
    public void imprimir() {
            System.out.println(nomeAluno);
            System.out.println(disciplinas);
        }
    
}

// Essa classe não armazena o historico. 
// O armazenamento é a lista de Disciplinas presente em cada instancia de AlunoGraduacao e AlunoPosGraduacao.
// Essa classe organiza e representa essas informações quando solicitadas.
// Criei um syso como output do historico, mas o ideal seria gerar um pdf ou algo assim, o que foge ao escopo.
