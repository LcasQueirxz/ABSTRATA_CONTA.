package main;


import contabancaria.dadosbanco;
import contabancaria.contacorrente;
import contabancaria.poupanca;

public class result {
    public static void main(String[] args) {
    	dadosbanco contaCorrente = new contacorrente(1000.00, 500.00);
    	dadosbanco contaPoupanca = new poupanca(1000.00);

        contaCorrente.deposito(700.00);
        contaCorrente.saque(100.00);
        contaCorrente.consulta();

        contaPoupanca.deposito(1.200);
        contaPoupanca.saque(370.00);
        contaPoupanca.consulta();
    }
}
