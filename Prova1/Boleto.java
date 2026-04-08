package Prova1;

public class Boleto {

    private String nomeAluno;
    private double valor;

    public Boleto(String nomeAluno, double valor) {
        this.nomeAluno = nomeAluno;
        this.valor = valor;
    }
}

// O unico metodo dessa classe é um construtor que ao instanciar a classe, armazena um nome de aluno e um valor 
// de mensalidade. Para realmente ser gerado um boleto, é necessario enviar esses dados para uma API de banco, mas isso
// foge do escopo da prova :)