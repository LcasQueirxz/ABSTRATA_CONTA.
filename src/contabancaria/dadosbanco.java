package contabancaria;

//classe abstrata para representar dados bancarios
public abstract class dadosbanco {
    protected double saldo; //campo para armazenar o saldo da conta

    //construtor para inicializar o saldo inicial da conta
    public dadosbanco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    //metodo abstrato para realizar saque, deve ser implementado pelas subclasses
    public abstract void saque(double valor);

    //metodo abstrato para realizar deposito, deve ser implementado pelas subclasses
    public abstract void deposito(double valor);

    //metodo abstrato para consultar saldo, deve ser implementado pelas subclasses
    public abstract void consulta();

    //metodo protegido para aplicar uma taxa ao saldo
    protected void aplicarTaxa(double taxa) {
        saldo -= taxa;
    }
}
