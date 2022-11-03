import java.util.ArrayList;

public class Bicicleta extends Veiculos{

    private String marca;
    private String cor;
    
    
    private static ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();

    Bicicleta( String nome, String marca, String cor){
        super(GetId.getNextId(bicicletas),nome);
        this.marca = marca;
        this.cor = cor;
        bicicletas.add(this);
    }
    
   
    public String getMarca() {
        return marca;
    }
    public String getCor() {
        return cor;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public static ArrayList<Bicicleta> getBicicleta() {
        return bicicletas;
    }

   
    public static Bicicleta verificaId(int id) throws Exception {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getId() == id) {
                return bicicleta;
            }
        }
        throw new Exception("Bibicleta não encontrada");
    }

    public static void removeBicicleta(int id) throws Exception {
        Bicicleta bicicleta = verificaId(id);
        bicicletas.remove(bicicleta);
    }

    @Override
    public String toString() {
        return ("Id do carro: " + super.getId() + "\n" +
        "Nome: " + super.getNome() + "\n" +
        "Marca: " + this.getMarca() + "\n" +
        "Cor: " + this.getCor());
    }
    


}
