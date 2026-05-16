package org.example;

public class FuncionarioCLT implements Colaborador {

    private int matricula;
    private String nome;
    private float salario;

    public FuncionarioCLT(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirFuncionarioCLT(this);
    }

}
