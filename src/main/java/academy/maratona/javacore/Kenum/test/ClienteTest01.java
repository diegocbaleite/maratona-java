package academy.maratona.javacore.Kenum.test;

import academy.maratona.javacore.Kenum.dominio.Cliente;
import academy.maratona.javacore.Kenum.dominio.TipoCliente;

import static academy.maratona.javacore.Kenum.dominio.Cliente.TipoPagamento.*;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
