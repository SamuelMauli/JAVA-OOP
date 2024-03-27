import java.util.Scanner;

public class SistemaBancario {
    public static void executarBancoSimples() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Sistema Bancário Simples!");
        
        // Criando uma conta bancária inicial com saldo de R$ 1000 igual a vida real, nem isso na verdade
        ContaBancaria conta = new ContaBancaria(1234, "Samuel", 1000.0);

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + conta.consultarSaldo());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    Main.main(null);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
