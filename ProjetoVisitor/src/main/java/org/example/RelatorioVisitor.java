package org.example;

public class RelatorioVisitor implements Visitor{

    public String exibir(Colaborador colaborador) {
        return colaborador.aceitar(this);
    }

    @Override
    public String exibirFuncionarioCLT(FuncionarioCLT funcionario) {
        return "FuncionarioCLT{" +
                "matricula=" + funcionario.getMatricula() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }

    @Override
    public String exibirTerceirizado(Terceirizado terceirizado) {
        return "Terceirizado{" +
                "id=" + terceirizado.getId() +
                ", nome='" + terceirizado.getNome() + '\'' +
                ", empresaOrigem='" + terceirizado.getEmpresaOrigem() + '\'' +
                '}';
    }

    @Override
    public String exibirEstagiario(Estagiario estagiario) {
        return "Estagiario{" +
                "matricula=" + estagiario.getMatricula() +
                ", nome='" + estagiario.getNome() + '\'' +
                ", instituicaoEnsino='" + estagiario.getInstituicaoEnsino() + '\'' +
                '}';
    }

}
