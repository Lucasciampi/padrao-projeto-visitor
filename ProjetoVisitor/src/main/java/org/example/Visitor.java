package org.example;

public interface Visitor {

    String exibirFuncionarioCLT(FuncionarioCLT funcionario);
    String exibirTerceirizado(Terceirizado terceirizado);
    String exibirEstagiario(Estagiario estagiario);

}
