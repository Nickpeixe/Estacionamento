import java.util.ArrayList;
public class Moto extends Veiculos {
    private String placa;
    private String cilindrada;
    
    
    private static ArrayList<Moto> motocicleta=new ArrayList<>();

    public Moto(String nome,String placa,String cilindrada){
        super(GetId.getNextId(motocicleta),nome);
        this.setPlaca(placa);;
        this.setCilindrada(cilindrada);;;
       motocicleta.add(this);
    }
    
   
    public String getPlaca(){
        return placa;
    }
    public String getCilindrada(){
        return cilindrada;
    }
    public void setPlaca(String placa){ 
        this.placa = placa;
    }
    public void setCilindrada(String cilindrada){
        this.cilindrada = cilindrada;
    }
    public static ArrayList<Moto> getMotocicleta(){

        return motocicleta;
    }
   

    public static Moto verificaId(int id) throws Exception {
        for (Moto moto : motocicleta) {
            if (moto.getId() == id) {
                return moto;
            }
        }
        throw new Exception("Mamífero não encontrado");
    }

    public static void removeMoto(int id) throws Exception {
        Moto moto = verificaId(id);
        motocicleta.remove(moto);
    }
    
    @Override
    public String toString() {
        return ("Id do carro: " + super.getId() + "\n" +
        "Nome: " + super.getNome() + "\n" +
        "Placa: " + this.getPlaca() + "\n" +
        "Cilindrada: " + this.getCilindrada());
    }
}
