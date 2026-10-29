/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chaincredito;

/**
 *
 * @author PICHAU
 */
public class SolicitacaoCredito {

    private String nomeCliente;
    private double valorSolicitado;

    public SolicitacaoCredito(String nomeCliente, double valorSolicitado) {
        this.nomeCliente = nomeCliente;
        this.valorSolicitado = valorSolicitado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }
}
