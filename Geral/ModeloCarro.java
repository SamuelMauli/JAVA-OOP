package Geral;
public class ModeloCarro {
    private String modelo;
    private int ano;
    private double quilometragem;

    public ModeloCarro(String modelo, int ano, double quilometragem) {
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }
}
