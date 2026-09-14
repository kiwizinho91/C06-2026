package pcmania.loja.pedidos;

import pcmania.loja.produtos.Computador;

public class ProcessarPedido {
    public static void enviarPedido(Computador computadores[]) {

        int qtd = 0;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                qtd = qtd + 1;
            }
        }
        if (qtd == 0) {
            System.out.println("Nenhum computador foi comprado, pedido cancelado!");
        } else {
            System.out.println("Pedido enviado...");
        }
    }
    }
}
