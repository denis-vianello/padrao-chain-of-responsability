/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chaincredito;

/**
 *
 * @author PICHAU
 */
public abstract class Aprovador {

    protected Aprovador proximo;

    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    public abstract String aprovar(SolicitacaoCredito solicitacao);
}
