import java.util.ArrayList;

public abstract class Veiculos implements GetId {

    private int id;
    private String nome;

    protected Veiculos(int id, String nome) {
        this.id = id;
        this.nome = nome;
        
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}