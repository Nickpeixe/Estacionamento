import java.util.ArrayList;

public class Moto extends Veiculos {
    
    private String placa;
    private String cilindrada;
    
    private static ArrayList<Moto> randandan = new ArrayList<>();

    public Moto(String placa, String cor, String cilindrada, int id, String nome)  {
        super(GetId.getNextId(randandan),id, nome);
        this.placa = placa;
        this.cilindrada = cilindrada;

        randandan.add(this);
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public static ArrayList<Moto> getMoto() {
        return randandan;
    }

    public static Moto getMoto(int id) throws Exception {
        for (Moto moto : randandan) {
            if (moto.getId() == id) {
                return moto;
            }
        }
        throw new Exception("Moto não encontrado");
    }

    public static void removeMoto(int id) throws Exception {
        Moto moto = getMoto(id);
        randandan.remove(moto);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Habitat=" + placa + "\n";
        return super.toString() + "Habitat=" + cilindrada + "\n";
    }
    
}