import java.util.ArrayList;

public class Carro extends Veiculos {
    
    private String placa;
    private String cor;
    private static ArrayList<Carro>carros=new ArrayList<>();

    Carro( String nome, String placa, String cor){
        super(GetId.getNextId(carros),nome);
        this.placa=placa;
        this.cor=cor;
        
        carros.add(this);

    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa=placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor=cor;
    }
    public static ArrayList<Carro> getCarros() {
        return carros;
    }
    

    public static Carro verificaId(int id) throws Exception {
        for (Carro carro : carros) {
            if (carro.getId() == id) {
                return carro;
            }
        }
        throw new Exception("Carro não encontrado");
    }

    public static void removeCarro(int id) throws Exception {
        Carro carro = verificaId(id);
        carros.remove(carro);
    }
    
    @Override
    public String toString() {
        return ("Id do carro: " + super.getId() + "\n" +
        "Nome: " + super.getNome() + "\n" +
        "Placa: " + this.getPlaca() + "\n" +
        "Cor: " + this.getCor());
    }
    public static boolean validaPlaca(String placa){ 
        boolean valido = true;   placa = placa.replaceAll("[^a-zA-Z0-9]", "");  
        if(placa.length() != 7){
         valido = false;   
        }   
        if(!placa.substring(0, 3).matches("[A-Z]*")){ 
          valido = false;   
        }   
        if(!placa.substring(3).matches("[0-9]*")){ 
          valido = false;   
        }   
          return valido;
        }

}
