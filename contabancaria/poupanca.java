package contabancaria;



public class poupanca extends dadosbanco {

    public poupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void saque(double valor) {
        double taxa = 1.50; // Taxa de saque para ContaPoupanca
        if (saldo >= valor + taxa) {
            saldo -= (valor + taxa);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void deposito(double valor) {
        double taxa = 0.50; // Taxa de depósito para ContaPoupanca
        saldo += (valor - taxa);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    @Override
    public void consulta() {
        double taxa = 0.25; // Taxa de consulta para ContaPoupanca
        aplicarTaxa(taxa);
        System.out.println("Saldo atual: R$" + saldo);
    }
}
