package org.example;

public class Terceirizado implements Colaborador {

    private int id;
    private String nome;
    private String empresaOrigem;

    public Terceirizado(int id, String nome, String empresaOrigem) {
        this.id = id;
        this.nome = nome;
        this.empresaOrigem = empresaOrigem;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmpresaOrigem() {
        return empresaOrigem;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirTerceirizado(this);
    }

}
