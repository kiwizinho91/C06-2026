package pcmania.loja.produtos;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico hardwares[];
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico hardwares[], SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.sistemaOperacional = sistemaOperacional;
    }

    //getters
    public float getPreco() {
        return preco;
    }

    //metodos
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preco: R$" + preco);

        for (HardwareBasico hardware : hardwares) {
            System.out.println(hardware.getNome() + ": " + hardware.getCapacidade());
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo()
                + " bits)");
        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + "Gb");
        }
    }
}
