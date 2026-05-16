package org.example;

public class Estagiario implements Colaborador {

    private int matricula;
    private String nome;
    private String instituicaoEnsino;

    public Estagiario(int matricula, String nome, String instituicaoEnsino) {
        this.matricula = matricula;
        this.nome = nome;
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirEstagiario(this);
    }

}
