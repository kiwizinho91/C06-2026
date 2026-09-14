package pcmania.loja.app;

import pcmania.loja.clientes.Cliente;
import pcmania.loja.pedidos.ProcessarPedido;
import pcmania.loja.produtos.Computador;
import pcmania.loja.produtos.HardwareBasico;
import pcmania.loja.produtos.MemoriaUSB;
import pcmania.loja.produtos.SistemaOperacional;

import java.util.Scanner;

public class Main {

    // minha matriculaa
    private static float matricula = 388;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Roberto Carlos", "345.367.123-76");

        int codigo = 0;
        int qtdComprados = 0;

        do {
            if (qtdComprados == 0) {
                System.out.println("========== LOJA PCMANIA ===========");
                System.out.println("===== ARSENAL DE COMPUTADORES =====");
                System.out.println();
                System.out.println("Selecione a(s) promocao(s) que deseja");
            } else {
                System.out.println("========== LOJA PCMANIA ===========");
                System.out.println("===== ARSENAL DE COMPUTADORES =====");
                System.out.println("Deseja mais alguma promocao?");
                System.out.println();
            }

            System.out.println("1 - Promocao 1 (Apple)");
            System.out.println("2 - Promocao 2 (Samsung)");
            System.out.println("3 - Promocao 3 (Dell)");
            System.out.println("0 - Finalizar compra");
            System.out.println();
            System.out.print("Digite o codigo da promocao: ");
            codigo = sc.nextInt();

            if (codigo == 1) {
                cliente.comprar(criaPromocao1());
                qtdComprados = qtdComprados + 1;
            } else if (codigo == 2) {
                cliente.comprar(criaPromocao2());
                qtdComprados = qtdComprados + 1;
            } else if (codigo == 3) {
                cliente.comprar(criaPromocao3());
                qtdComprados = qtdComprados + 1;
            } else if (codigo == 0) {
                System.out.println();
                System.out.println("Finalizando a compra...");
            } else {
                System.out.println("Codigo invalido!");
            }

            System.out.println();

        } while (codigo != 0);

        cliente.mostraDados();
        System.out.println();

        ProcessarPedido.enviarPedido(cliente.getComputadores());

        sc.close();
    }

    // computaadores
    private static Computador criaPromocao1() {

        HardwareBasico hardwares[] = new HardwareBasico[3];
        hardwares[0] = new HardwareBasico("Processador Pentium Core i5 (Mhz)", 2200);
        hardwares[1] = new HardwareBasico("Memoria RAM (Gb)", 8);
        hardwares[2] = new HardwareBasico("HD (Gb)", 500);
        SistemaOperacional so = new SistemaOperacional("macOS Sequoia", 64);

        Computador pc = new Computador("Apple", matricula, hardwares, so);
        pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        return pc;
    }

    private static Computador criaPromocao2() {

        HardwareBasico hardwares[] = new HardwareBasico[3];
        hardwares[0] = new HardwareBasico("Processador Pentium Core i7 (Mhz)", 3370);
        hardwares[1] = new HardwareBasico("Memoria RAM (Gb)", 16);
        hardwares[2] = new HardwareBasico("HD (Gb)", 1000);
        SistemaOperacional so = new SistemaOperacional("Windows 8", 64);

        Computador pc = new Computador("Samsung", matricula + 1, hardwares, so);
        pc.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        return pc;
    }

    private static Computador criaPromocao3() {

        HardwareBasico hardwares[] = new HardwareBasico[3];
        hardwares[0] = new HardwareBasico("Processador Pentium Core i7 (Mhz)", 4500);
        hardwares[1] = new HardwareBasico("Memoria RAM (Gb)", 32);
        hardwares[2] = new HardwareBasico("HD (Gb)", 2000);
        SistemaOperacional so = new SistemaOperacional("Windows 10", 64);

        Computador pc = new Computador("Dell", matricula + 2, hardwares, so);
        pc.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        return pc;
    }
}
