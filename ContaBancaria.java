public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.isEmpty()) {
            System.out.println("Erro: Número da conta não pode ser nulo ou vazio.");
            return;
        }
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Erro: Titular não pode ser nulo ou vazio.");
            return;
        }
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de depósito deve ser positivo.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de saque deve ser positivo.");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        }
    }
}