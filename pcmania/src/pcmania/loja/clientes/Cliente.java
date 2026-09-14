package pcmania.loja.clientes;

import pcmania.loja.produtos.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador computadores[];
    private int qtdComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[20];
        this.qtdComputadores = 0;
    }

    //ggetters
    public Computador[] getComputadores() {
        return computadores;
    }


    //metodos
    public void comprar(Computador pc) {
        if (qtdComputadores < computadores.length) {
            computadores[qtdComputadores] = pc;
            qtdComputadores = qtdComputadores + 1;
            System.out.println("PC adicionado a compra!");
        } else {
            System.out.println("Limite de PCs atingido!");
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdComputadores; i++) {
            total = total + computadores[i].getPreco();
        }
        return total;
    }

    public void mostraDados() {
        System.out.println("========== INFORMACOES DO CLIENTE ==========");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println();
        if (qtdComputadores == 0) {
            System.out.println("Nenhum computador foi comprado.");
            return;
        }
        System.out.println("========== COMPUTADORES COMPRADOS ==========");
        for (int i = 0; i < qtdComputadores; i++) {
            System.out.println("--- PC " + (i + 1) + " ---");
            computadores[i].mostraPCConfigs();
            System.out.println();
        }

        System.out.println("VALOR TOTAL DA COMPRA: R$" + calculaTotalCompra());
    }
}
