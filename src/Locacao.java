import java.util.ArrayList;

public class Locacao  {
    
    private int id;
    private String data;
    private int idVeiculo;
    private int idVaga;
    

    private static ArrayList<Locacao> locacoes = new ArrayList<>();

    public Locacao(int id, String data,int idVeiculo,int idVaga){
        this.setId(id);
        this.setData(data);
        this.setIdVeiculo(idVeiculo);
        this.setIdVaga(idVaga);
        

        locacoes.add(this);
    }
    public int getId(){
        return id;  
    }
    private  int setId(int id){
        return this.id=id;
    }
    public String getData(){
        return data;
    }
    private String setData(String data){
        return this.data=data;
    }
    public int getIdVeiculo(){
        return idVeiculo;
    }
    private int setIdVeiculo(int  idVeiculo){
        return this.idVeiculo=idVeiculo;
    }
    private int setIdVaga(int idVaga){
        return this.idVaga=idVaga;
    }
    
     public int getIdVaga(){
        return idVaga; 
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
    public static boolean verificaData(String data) throws Exception {
        for (Locacao locacao : locacoes) {
            if (locacao.getData().equals(data)) {
                return true;
            }
            else{
                return false;

            }
        }
        throw new Exception("Data já cadstrada");
    }

    @Override
    public String toString() {
        return ("Id do carro: " + getId() + "\n" +
                "Data: " + getData() + "\n" +
                "Vaga: " + this.getIdVaga() + "\n" + 
                "Veiculo: " + this.getIdVeiculo());
    }
    
    
      
}
