import java.util.ArrayList;

public class Bicicleta extends Veiculos {
    
    private String marca;
    private String cor;
    
    private static ArrayList<Bicicleta> bikecem = new ArrayList<>();

    public Bicicleta(String marca, String cor, int id, String nome)  {
        super(GetId.getNextId(bikecem),id, nome);
        this.marca = marca;
        this.cor = cor;
        
        bikecem.add(this);
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getcor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public static ArrayList<Bicicleta> getBicicleta()) {
        return bikecem;
    }

    public static Bicicleta getBicicleta(int id) throws Exception {
        for (Bicicleta bicicleta : bikecem) {
            if (bicicleta.getId() == id) {
                return bicicleta;
            }
        }
        throw new Exception("Bicicleta não encontrado");
    }

    public static void removeBicicleta(int id) throws Exception {
        Bicicleta bicicleta = getBicicleta(id);
        bikecem.remove(bicicleta);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Habitat=" + habitat + "\n";
    }
    
}