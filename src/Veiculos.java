import java.util.ArrayList;

public class Veiculos implements GetId{
    private int id;
    private String nome;
    
    protected ArrayList<Locacao>locacoes;
    
    public Veiculos(int id, String nome){
        this.setId(id);
        this.setNome(nome);
        
    }

    public int getId() {
        return id;
    }
    private int setId(int id) {
        return this.id=id;
    }
    private String setNome(String nome){
        return this.nome=nome;

    }
    public String  getNome(){
        return nome;
    }
   
  

}   