import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Joao da Silva";
        cliente1.cpf = "123.456.789-00";
        cliente1.telefone = "+55 11 998001234";
        cliente1.senha = "5555";

        Conta conta1 = new Conta();
        conta1.banco = "Banco PoloTech";
        conta1.tipoConta = "Conta Corrente";
        conta1.agencia = 0101;
        conta1.numeroConta = 121236;
        conta1.saldo = 3000.00;

        System.out.println("Bem vindo ao Banco PoloTech");
        System.out.println("Insira seu cpf: ");
        if (scan.next().equals(cliente1.cpf)) {
            System.out.println("Insira sua senha: ");
            if (scan.next().equals(cliente1.senha)) {
                menu(scan, conta1);
            }
        }
    }

    private static void menu(Scanner scan, Conta conta1) {
        int escolha;
        do {
            System.out.println();
            System.out.println("Escolha a operação: ");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar: ");
            System.out.println("3 - Sacar: ");
            System.out.println("4 - Sair. ");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1 -> conta1.mostrarSaldo();
                case 2 -> {
                    System.out.println("Qual valor deseja depositar? ");
                    double valor = scan.nextDouble();
                    conta1.deposito(valor);
                    conta1.mostrarSaldo();

                }
                case 3 -> {
                    System.out.println("Qual valor deseja sacar? ");
                    double valor = scan.nextDouble();
                    conta1.saque(valor);
                    conta1.mostrarSaldo();
                }


            }
        }
        while (escolha != 4);
    }
}

