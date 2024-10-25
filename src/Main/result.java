package Main;

import contabancaria.dadosbanco;
import contabancaria.contacorrente;
import contabancaria.poupanca;

//classe principal para executar o programa
public class result {
    public static void main(String[] args) {
        //criando instancias de conta corrente e conta poupanca com saldos iniciais
        dadosbanco contaCorrente = new contacorrente(1000.00, 500.00);
        dadosbanco contaPoupanca = new poupanca(1000.00);

        //realizando operacoes na conta corrente
        contaCorrente.deposito(700.00);
        contaCorrente.saque(100.00);
        contaCorrente.consulta();

        //realizando operacoes na conta poupanca
        contaPoupanca.deposito(1.200);
        contaPoupanca.saque(370.00);
        contaPoupanca.consulta();
    }
}

