/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chaincredito;

/**
 *
 * @author PICHAU
 */
public class DiretoriaCredito extends Aprovador {

    private static final double LIMITE = 200000.00;

    @Override
    public String aprovar(SolicitacaoCredito solicitacao) {
        if (solicitacao.getValorSolicitado() <= LIMITE) {
            return "Credito aprovado pela Diretoria de Credito.";
        }

        return "Credito recusado: valor acima do limite permitido.";
    }
}
