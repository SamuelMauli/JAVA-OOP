package Exercicios.Ex5;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        Velocidade.acelerar(velocidadeAtual);
    }

    public void frear() {
        Velocidade.frear(velocidadeAtual);
    }

    public void exibirInfo() {
        Informacoes.exibirInfo(marca, modelo, ano, placa, velocidadeAtual);
    }
}
