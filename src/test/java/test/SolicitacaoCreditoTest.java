/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package test;

import com.mycompany.chaincredito.Aprovador;
import com.mycompany.chaincredito.DiretoriaCredito;
import com.mycompany.chaincredito.GerenteAgencia;
import com.mycompany.chaincredito.GerenteRegional;
import com.mycompany.chaincredito.SolicitacaoCredito;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolicitacaoCreditoTest {

    private Aprovador criarCadeia() {
        Aprovador gerenteAgencia = new GerenteAgencia();
        Aprovador gerenteRegional = new GerenteRegional();
        Aprovador diretoria = new DiretoriaCredito();

        gerenteAgencia.setProximo(gerenteRegional);
        gerenteRegional.setProximo(diretoria);

        return gerenteAgencia;
    }

    @Test
    public void deveAprovarCreditoPeloGerenteAgencia() {
        Aprovador cadeia = criarCadeia();
        SolicitacaoCredito solicitacao =
                new SolicitacaoCredito("Cliente A", 5000.00);

        assertEquals(
                "Credito aprovado pelo Gerente de Agencia.",
                cadeia.aprovar(solicitacao)
        );
    }

    @Test
    public void deveAprovarCreditoPeloGerenteRegional() {
        Aprovador cadeia = criarCadeia();
        SolicitacaoCredito solicitacao =
                new SolicitacaoCredito("Cliente B", 25000.00);

        assertEquals(
                "Credito aprovado pelo Gerente Regional.",
                cadeia.aprovar(solicitacao)
        );
    }

    @Test
    public void deveAprovarCreditoPelaDiretoria() {
        Aprovador cadeia = criarCadeia();
        SolicitacaoCredito solicitacao =
                new SolicitacaoCredito("Cliente C", 100000.00);

        assertEquals(
                "Credito aprovado pela Diretoria de Credito.",
                cadeia.aprovar(solicitacao)
        );
    }

    @Test
    public void deveRecusarCreditoAcimaDoLimite() {
        Aprovador cadeia = criarCadeia();
        SolicitacaoCredito solicitacao =
                new SolicitacaoCredito("Cliente D", 250000.00);

        assertEquals(
                "Credito recusado: valor acima do limite permitido.",
                cadeia.aprovar(solicitacao)
        );
    }
}

