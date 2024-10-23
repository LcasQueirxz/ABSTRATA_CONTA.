package contabancaria;


public abstract class dadosbanco{
    protected double saldo;

    public dadosbanco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract void saque(double valor);
    public abstract void deposito(double valor);
    public abstract void consulta();

    protected void aplicarTaxa(double taxa) {
        saldo -= taxa;
    }
}

