import java.util.ArrayList;

public class Locacao extends Veiculos {
    
    private String data;

    
    private static ArrayList<Locacao> aloca = new ArrayList<>();

    public Locacao(String data, int id, String nome)  {
        super(GetId.getNextId(aloca),id, nome);
        this.data = data;
        
        aloca.add(this);
    }
    
}