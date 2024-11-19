criar pasta Cores e pasta formas 

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/c8747024-3e3b-4be3-98a8-0b06a1883b87/1fb2633c-7e6a-4a87-adb4-0b262b32aa24/image.png)

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
