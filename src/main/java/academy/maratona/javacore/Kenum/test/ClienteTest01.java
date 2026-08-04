package academy.maratona.javacore.Kenum.test;

import academy.maratona.javacore.Kenum.dominio.Cliente;
import academy.maratona.javacore.Kenum.dominio.TipoCliente;
import academy.maratona.javacore.Kenum.dominio.TipoPagamento;


public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}