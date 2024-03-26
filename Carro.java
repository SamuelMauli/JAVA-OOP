import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        executarCarro();
    }

    public static void executarCarro() {
        Volante volante = new Volante();
        ModeloCarro modeloCarro = new ModeloCarro("McLaren Senna GTR", 2019, 150.4); 

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Frear");
            System.out.println("5. Ver informações do carro");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    volante.ligar();
                    break;
                case 2:
                    volante.desligar();
                    break;
                case 3:
                    if (volante.isLigado()) {
                        volante.acelerar();
                    } else {
                        System.out.println("Você precisa ligar o carro primeiro.");
                    }
                    break;
                case 4:
                    volante.frear();
                    break;
                case 5:
                    exibirInformacoesCarro(modeloCarro, volante);
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

    public static void exibirInformacoesCarro(ModeloCarro modeloCarro, Volante volante) {
        System.out.println("\nInformações do Carro:");
        System.out.println();
        modeloCarro.exibirInformacoes();
        System.out.println("Estado do motor: " + (volante.isLigado() ? "Ligado" : "Desligado"));
        System.out.println("Velocidade: " + volante.getVelocidade() + " km/h");
    }
}
