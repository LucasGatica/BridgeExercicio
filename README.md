

**1. criar interface cor**

```java
package cores;

public interface Cor {
     void aplicarCor();
}

```

**2. criar cor vermelha herdando de cor**

```java
package cores;

public class Vermelho implements Cor{
    @Override
    public void aplicarCor() {
        System.out.println("Vermelho");
    }
}

```

**3. criar cor azul herdando de cor**

```java
package cores;

public class Azul implements Cor{
    @Override
    public void aplicarCor() {
        System.out.println("Azul");
    }
}

```

1. criar classe abstrata Forma que tem uma composicao de cor 

usei abstract class pois eu precisava declarar a forma e se eu tivesse usando interface eu nao conseguiria declarar variáveis 

```java
package formas;

import cores.Cor;

public abstract class Forma {
    protected Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }
    
    public abstract void desenhar();
}

```

5 Criar classe Quadrado que herda de Forma

```java
package formas;

import cores.Cor;

public class Quadrado extends Forma{
    public Quadrado(Cor cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.print("Desenhando quadrado ");
        cor.aplicarCor();
    }
}

```

6 Criar classe Círculo que herda de Forma

```java
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

```
7. classe para testar a aplicacao
```java
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
```
