package br.com.banco.conta;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João Silva", "12345678900");
        Pessoa pessoa2 = new Pessoa("Maria Oliveira", "98765432100");

        ContaCorrente contaCorrente1 = new ContaCorrente(1001, pessoa1);
        ContaCorrente contaCorrente2 = new ContaCorrente(1002, pessoa2);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(2001, pessoa1);
        contaPoupanca1.setJuros(1.5);

        contaCorrente1.adicionar(contaCorrente1);
        contaCorrente2.adicionar(contaCorrente2);
        contaPoupanca1.adicionar(contaPoupanca1);

        contaCorrente1.depositar(1000.0);
        contaCorrente1.sacar(500.0);
        contaCorrente2.depositar(2000.0);
        contaCorrente2.sacar(2500.0); 

        contaPoupanca1.depositar(1500.0);
        contaPoupanca1.depositarRendimento(); 

        
        try {
            ContaCorrente contaBuscada = contaCorrente1.buscar(1001);
            System.out.println("Conta encontrada: " + contaBuscada.getNumero());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        
        List<ContaCorrente> contasPorCPF = contaCorrente1.buscar("12345678900");
        System.out.println("Contas encontradas para o CPF 12345678900: " + contasPorCPF.size());

        
        List<ContaCorrente> todasContas = contaCorrente1.buscar();
        System.out.println("Total de contas: " + todasContas.size());

        
        for (ContaCorrente conta : todasContas) {
            System.out.println("Conta número: " + conta.getNumero() + ", Titular: " + conta.getTitular().getNome() + ", Saldo: R$" + conta.getSaldo());
        }
    }
}
