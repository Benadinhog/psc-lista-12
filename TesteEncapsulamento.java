public class TesteEncapsulamento {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta("12345-9");
        conta.setTitular("Maria");

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(800);
        conta.depositar(-50);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}