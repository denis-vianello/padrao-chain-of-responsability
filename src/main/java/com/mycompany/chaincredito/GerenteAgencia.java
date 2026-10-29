/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chaincredito;

/**
 *
 * @author PICHAU
 */
public class GerenteAgencia extends Aprovador {

    private static final double LIMITE = 10000.00;

    @Override
    public String aprovar(SolicitacaoCredito solicitacao) {
        if (solicitacao.getValorSolicitado() <= LIMITE) {
            return "Credito aprovado pelo Gerente de Agencia.";
        }

        if (proximo != null) {
            return proximo.aprovar(solicitacao);
        }

        return "Solicitacao nao pode ser aprovada neste nivel.";
    }
}
