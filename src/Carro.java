import java.util.ArrayList;

public class Carro extends Veiculos {
    
    private String placa;
    private String cor;
    
    private static ArrayList<Carro> batmovel = new ArrayList<>();

    public Carro(String placa, String cor, int id, String nome)  {
        super(GetId.getNextId(batmovel),id, nome);
        this.placa = placa;
        this.cor = cor;

        batmovel.add(this);
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public static ArrayList<Carro> getCarros() {
        return batmovel;
    }

    public static Carro getCarro(int id) throws Exception {
        for (Carro carro : batmovel) {
            if (carro.getId() == id) {
                return carro;
            }
        }
        throw new Exception("Carro não encontrado");
    }

    public static void removeCarrol(int id) throws Exception {
        Carro carro = getCarro(id);
        batmovel.remove(carro);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Habitat=" + habitat + "\n";
    }
    
}
