public class Volante {
    private boolean ligado;
    private int velocidade;

    public Volante() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar() {
        if (ligado) {
            velocidade += 10;
            System.out.println("Velocidade aumentada para " + velocidade + " km/h.");
        } else {
            System.out.println("Você precisa ligar o carro primeiro.");
        }
    }

    public void frear() {
        if (ligado) {
            if (velocidade > 0) {
                velocidade -= 10;
                System.out.println("Velocidade reduzida para " + velocidade + " km/h.");
            } else {
                System.out.println("O carro já está parado.");
            }
        } else {
            System.out.println("Você precisa ligar o carro primeiro.");
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }
}
