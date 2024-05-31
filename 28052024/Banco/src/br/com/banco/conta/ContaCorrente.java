package br.com.banco.conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class ContaCorrente implements ContasDAO{
    protected int numero;
    protected double saldo;
    protected Pessoa titular;

    public ContaCorrente(int numero, Pessoa titular){
        this.numero = numero;
        this.titular = titular;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return this.titular;
    }


    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("R$" + valor + " foram adicionados à sua conta. Saldo atual: R$" + this.saldo);
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Valor muito alto! Saque cancelado. Saldo atual: R$" + this.saldo);
        }else{
            this.saldo -= valor;
            System.out.println("R$" + valor + " foram sacados. Saldo atual: R$" + this.saldo);

        }
    }


    @Override
    public void adicionar(ContaCorrente conta) {
        ContasDAO.listaContas.add(conta);
    }


    @Override
    public List<ContaCorrente> buscar() {
        Collections.sort(listaContas, Comparator.comparingInt(ContaCorrente::getNumero));
        return listaContas;
    }


    @Override
    public ContaCorrente buscar(int numeroConta) {
        for (ContaCorrente conta : listaContas) {
            if(conta.getNumero() == numeroConta){
                return conta;
            }
        }

        throw new NoSuchElementException("Nenhum resultado foi encontrado.");
    }


    @Override
    public List<ContaCorrente> buscar(String cpfTitular) {
        List<ContaCorrente> buscaContasCPF = new ArrayList<>();
        for (ContaCorrente contaCorrente : listaContas) {
            if(contaCorrente.getTitular().getCpf().equals(cpfTitular)){
                buscaContasCPF.add(contaCorrente);
            }
        }

        return buscaContasCPF;

    }

}
