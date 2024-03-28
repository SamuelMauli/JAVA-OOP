package Exercicios.Ex6;

public class AdicionarContato {
    public static void adicionarContato(Agenda agenda, String nome, String telefone) {
        Contato novoContato = new Contato(nome, telefone);
        agenda.adicionarContato(novoContato);
    }
}
