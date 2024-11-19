package formas;

import cores.Cor;

public class Circulo extends Forma{
    public Circulo(Cor cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.print("Desenhando circulo ");
        cor.aplicarCor();
    }
}
