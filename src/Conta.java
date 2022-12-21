public class Conta {
        String banco;
        String tipoConta;
        int agencia;
        int numeroConta;
        double saldo;


    public void deposito (double valor){
        saldo = saldo + valor;
    }
    public void saque(double valor){
        saldo = saldo - valor;
    }

    public void mostrarSaldo(){
        System.out.printf("Saldo: "+ saldo + " reais");
    }
}
