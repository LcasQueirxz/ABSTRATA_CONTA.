package contabancaria;

//classe que representa uma conta corrente, extende dadosbanco
public class contacorrente extends dadosbanco {
    private double limite; //campo para armazenar o limite da conta corrente

    //construtor para inicializar o saldo inicial e o limite da conta corrente
    public contacorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    //metodo para realizar saque, com taxa especifica para conta corrente
    @Override
    public void saque(double valor) {
        double taxa = 2.50; // Taxa de saque para ContaCorrente
        if (saldo + limite >= valor + taxa) {
            saldo -= (valor + taxa);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    //metodo para realizar deposito, com taxa especifica para conta corrente
    @Override
    public void deposito(double valor) {
        double taxa = 1.00; // Taxa de depósito para ContaCorrente
        saldo += (valor - taxa);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    //metodo para consultar saldo, aplicando taxa especifica para consulta
    @Override
    public void consulta() {
        double taxa = 0.50; // Taxa de consulta para ContaCorrente
        aplicarTaxa(taxa);
        System.out.println("Saldo atual: R$" + saldo);
    }
}
