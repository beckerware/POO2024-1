package br.com.banco.conta;

import java.util.ArrayList;
import java.util.List;

public interface ContasDAO {
    List<ContaCorrente> listaContas = new ArrayList<>();
    
    void adicionar(ContaCorrente conta);
    List<ContaCorrente> buscar();
    ContaCorrente buscar(int numeroConta);
    List<ContaCorrente> buscar(String cpfTitular);
}
