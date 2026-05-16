package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioVisitorTest {

    @Test
    void deveExibirFuncionarioCLT() {
        FuncionarioCLT clt = new FuncionarioCLT(1, "FuncionarioCLT", 3000.0f);
        RelatorioVisitor visitor = new RelatorioVisitor();
        assertEquals("FuncionarioCLT{matricula=1, nome='FuncionarioCLT', salario=3000.0}", visitor.exibir(clt));
    }

    @Test
    void deveExibirTerceirizado() {
        Terceirizado terceirizado = new Terceirizado(1, "FuncionarioTerceirizado", "EmpresaTerceirizada");
        RelatorioVisitor visitor = new RelatorioVisitor();
        assertEquals("Terceirizado{id=1, nome='FuncionarioTerceirizado', empresaOrigem='EmpresaTerceirizada'}", visitor.exibir(terceirizado));
    }

    @Test
    void deveExibirEstagiario() {
        Estagiario estagiario = new Estagiario(2, "Estagiario", "UniversidadeTeste");
        RelatorioVisitor visitor = new RelatorioVisitor();
        assertEquals("Estagiario{matricula=2, nome='Estagiario', instituicaoEnsino='UniversidadeTeste'}", visitor.exibir(estagiario));
    }


}