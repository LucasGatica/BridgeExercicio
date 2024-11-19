import cores.Azul;
import cores.Vermelho;
import formas.Circulo;
import formas.Quadrado;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(new Vermelho());
        Quadrado quadrado = new Quadrado(new Azul());

        circulo.desenhar();
        quadrado.desenhar();
    }
}
