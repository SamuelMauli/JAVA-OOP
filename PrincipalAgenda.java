import java.util.Scanner;

public class PrincipalAgenda {
    public static void main(String[] args) {
        executarAgendaDeContatos();
    }

    public static void executarAgendaDeContatos() {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Buscar contato");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nomeAdicionar = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefoneAdicionar = scanner.nextLine();
                    agenda.adicionarContato(new Contato(nomeAdicionar, telefoneAdicionar));
                    break;
                case 2:
                    System.out.print("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.print("Nome do contato a buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    agenda.buscarContato(nomeBuscar);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
