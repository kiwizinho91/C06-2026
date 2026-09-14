package pcmania.loja.produtos;

public class MemoriaUSB {

    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //geters
    public String getNome() {
        return nome;
    }
    public int getCapacidade() {
        return capacidade;
    }
}

