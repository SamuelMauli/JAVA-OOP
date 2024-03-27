import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaPessoal {
    private ArrayList<Livro> livros;

    public BibliotecaPessoal() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void exibirLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Lista de Livros na Biblioteca:");
            for (Livro livro : livros) {
                livro.exibirInfo();
                System.out.println();
            }
        }
    }

    public static void executarBibliotecaPessoal() {
        Scanner scanner = new Scanner(System.in);
        BibliotecaPessoal biblioteca = new BibliotecaPessoal();
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Exibir Livros");
            System.out.println("0. Voltar");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ano de publicação do livro:");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    Livro novoLivro = new Livro(titulo, autor, ano);
                    biblioteca.adicionarLivro(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    biblioteca.exibirLivros();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal.");
                    Main.main(null);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
