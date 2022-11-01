import java.util.ArrayList;

public class Locacao  {
    
    private int id;
    private String data;
    private int idVeiculo;
    private Veiculos veiculos;
    private int idVaga;
    private Vagas vagas;

    private static ArrayList<Locacao> locacoes = new ArrayList<>();

    public Locacao(int id, String data, Veiculos veiculos,int idVaga){
        this.id=id;
        this.data=data;
        this.idVeiculo=veiculos.getId();
        this.veiculos=veiculos;

        locacoes.add(this);
    }
    public int getId(){
        return id;  
    }
    public String getData(){
        return data;
    }
    public int getIdVeiculo(){
        return idVeiculo;
    }
    public Veiculos getVeiculos(){
        return veiculos;
    }
     public int getIdVaga(){
        return idVaga; 
     }
     public Vagas getVagas(){
        return vagas;
     }
    public static ArrayList<Locacao> getLocacoes(){
        return locacoes;
    }
    public static Locacao getLocacao(int id) throws Exception {
        for (Locacao locacao : locacoes) {
            if (locacao.getId() == id) {
                return locacao;
            }
        }
        throw new Exception("Locacao não encontrada");
    }
   
    public static void removeLocacao(int id) throws Exception {
        Locacao locacao = getLocacao(id);
        locacoes.remove(locacao);
    }

    @Override
    public String toString() {
        return "Id = " + idVeiculo + "\n"
            + "Data = " + data + "\n"
            + "Vaga = " + vagas + "\n";

    }
    
      
}
