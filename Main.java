import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha o exercício que deseja executar:");
            System.out.println("1. Calculadora");
            System.out.println("2. Biblioteca Pessoal");
            System.out.println("3. Sistema Bancário");
            System.out.println("4. Gerenciamento de Jogadores");
            System.out.println("5. Sistema de Carros Clássicos");
            System.out.println("6. Agenda de Contatos");
            System.out.println("7. Gerenciamento de Estoque");
            System.out.println("8. Sistema de Pedidos de Pizzaria");
            System.out.println("0. Fechar programa");
            System.out.print("Opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Calculadora.executarCalculadora();
                    break;
                case 2:
                    BibliotecaPessoal.executarBibliotecaPessoal();
                    break;
                case 3:
                    SistemaBancario.executarBancoSimples();
                    break;
                case 4:
                    GerenciamentoJogadores.executarGerenciamentoJogadores();
                    break;
                case 5:
                    Carro.executarCarro();
                    break;
                case 6:
                    PrincipalAgenda.executarAgendaDeContatos();
                    break;
                case 7:
                    // Executar exercício 07 (Gerenciamento de Estoque)
                    break;
                case 8:
                    // Executar exercício 08 (Sistema de Pedidos de Pizzaria)
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (escolha != 0);
        scanner.close();
    }
}
