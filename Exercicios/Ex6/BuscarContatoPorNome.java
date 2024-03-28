package Exercicios.Ex6;

public class BuscarContatoPorNome {
    public static void buscarContatoPorNome(Agenda agenda, String nome) {
        Contato contatoEncontrado = agenda.buscarContatoPorNome(nome);
        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado);
        }
    }
}
