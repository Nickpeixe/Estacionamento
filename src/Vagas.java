import java.util.ArrayList;
public class Vagas {
    private int id;
    private String numero;
    private String tipo;
    private int tamanho;
    private double valor;
    private ArrayList<Locacao> locacoes;
    
    private static ArrayList<Vagas> vaguinha = new ArrayList<Vagas>();

    public Vagas(int id, String numero, String tipo, int tamanho, double valor){
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.valor = valor;

        this.locacoes = new ArrayList<Locacao>();


    }
    public int getId() {
        return id;

    }
    public void setId(int id) {
        this.id = id;
}


    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {

        this.tipo = tipo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public static ArrayList<Vagas> getVagas() {
        return vaguinha;
    }
    public ArrayList<Locacao>  getLocacoes (){
        return locacoes;
    }
    public void setLocacao(Locacao locacao){
        this.locacoes.add(locacao);
    }

    
    public static Vagas verificaVaga(int id) throws Exception {
        for (Vagas vagas : vaguinha) {
            if (vagas.getId() == id) {
                return vagas;
            }
        }
        throw new Exception("Vaga não encontrada");
    }

    public static void removeVaga(int id) throws Exception {
        Vagas vagas = verificaVaga(id);
        vaguinha.remove(vagas);
    }
    


}