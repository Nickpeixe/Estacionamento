import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Estacionamento: ");


        do {
            System.out.println("O que deseja fazer?");
            System.out.println("[1]  - Cadastrar Veiculo");
            System.out.println("[4]  - Cadastrar Vaga");
            System.out.println("[5]  - Cadastrar Locação");
            System.out.println("[8]  - Listar Veiculo");
            System.out.println("[9]  - Listar Vaga");
            System.out.println("[10] - Listar Locação");
            System.out.println("[11] - Remover Carro");
            System.out.println("[12] - Remover Moto");
            System.out.println("[13] - Remover Bicicleta");
            System.out.println("[14] - Remover vaga");
            System.out.println("[15] - Remover Locação");
            System.out.println("[16] - Sair");
            System.out.print("Opção: ");
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    cadastrarVeiculo(scanner);
                    break;
                case 2:
                cadastrarVaga(scanner);
                break;
                    
                case 3:
                cadastrarLocacao(scanner);
                case 4:
                listarVeiculo();
                    break;
                case 5:
                listarVagas();
                break;
                case 6:
                    listarVagas();
                    break;
                
                case 7:
                    
                    break;
                case 8:
                    
                case 9:
                    removerVeiculo(scanner);
                    break;
                case 10:
                    removerVagas(scanner);
                    break;
                case 13:
                    removerLocacao(scanner);
                    break;
                case 14:
                    
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 13);
        
    }

    public static void cadastrarVeiculo(Scanner scanner) {
        System.out.println("Cadastrar Veiculo");
        System.out.println("Digite o nome do veiculo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o tipo: ([C] Carro; [M] Moto; [B] Bicicleta)");
        String tipo = scanner.next();

        switch (tipo) {
            case "C":
                System.out.println("Informe a placa do Carro:");
                String  placa= scanner.next();
                System.out.println("Informe a cor do carro:");
                String cor = scanner.next();
               
            try {
                     
                Carro carro = new Carro (nome, placa, cor);
                System.out.println("Carro cadastrado com sucesso!");
                
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            
            case "M":
            System.out.println("Informe a placa da moto:");
            String  placa1= scanner.next();
            System.out.println("Informe a cilindrada da moto:");
            String cilindrada = scanner.next();
        
            try {

            Moto moto = new Moto (nome, placa1,cilindrada);
            System.out.println("Moto cadastrada com sucesso!");
        
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
                break;
            case "B":
                System.out.println("Informe a marca da bicicleta:");
                String marca = scanner.next();
                System.out.println("Informe a cor da bicleta:");
                 cor = scanner.next();
                try {
                    new Bicicleta(nome,marca,cor);
                    System.out.println("Ave cadastrada com sucesso!");
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            
        }
    }

    public static void cadastrarVaga(Scanner scanner) {
        System.out.println("Cadastrar vaga");
        System.out.println("Digite o id da vaga:");
        String id = scanner.next();
        System.out.println("Infome o número da vaga");
        String numero = scanner.next();
        System.out.println("Digite o tipo da vaga:");
        String tipo = scanner.next();
        System.out.println("Digita o tamanho da vaga:");
        int tamanho = scanner.nextInt();
        System.out.println("Digite o valor da vaga:");
        double valor = scanner.nextDouble();
        try {
            new Vagas(tamanho, numero, tipo, tamanho, valor);
            System.out.println("Vaga cadastrada com sucesso");

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        



    }

    public static void cadastrarLocacao(Scanner scanner) throws Exception {
        
        System.out.println("Cadastrar locação");
        System.out.println("Informe o id da locacao:");
        int id = scanner.nextInt();
        System.out.println("Informe a data da locação:");
        String data = scanner.next();
        System.out.println("Qual tipo de veículo deseja cadastrar: ");
        String tipo = scanner.next();
        switch(tipo){
            case "C":
            System.out.println("Informe o id do carro");
            int idCarro = scanner.nextInt();
            Carro.verificaId(idCarro);
            System.out.println("Informe o id da vaga:");

            int idVaga = scanner.nextInt();
            Vagas vagas = Vagas.verificaVaga(idVaga);
            new Vagas(id, data, tipo, idCarro, idVaga);
            System.out.println("Locacao cadastrada com sucesso");
            break;
            
            case "M":
            System.out.println("Informe o id do carro");
            int idMoto = scanner.nextInt();
            Moto moto = Moto.verificaId(idMoto);
            System.out.println("Informe o id da vaga:");
            idVaga = scanner.nextInt();
            Vagas vagas1 = Vagas.verificaVaga(idVaga);
            new Vagas(id, data, tipo, idMoto, idVaga);
            System.out.println("Locacao cadastrada com sucesso");
            break;
            
            
            case "B":
            System.out.println("Informe o id da bicicleta");
            int idBic = scanner.nextInt();
            Bicicleta bicicleta = Bicicleta.verificaId(idBic);
            System.out.println("Informe o id da vaga:");
            idVaga = scanner.nextInt();
            vagas =Vagas.verificaVaga(idVaga);
            new Vagas(id, data, tipo, idBic, idVaga);
            System.out.println("Locacao cadastrada com sucesso");
            
        }
        
            
        }

        public static void listarVeiculo() {
            System.out.println("Listar aves");
            for (Carro carro : Carro.getCarros()) {
                System.out.println(carro);
            }
            System.out.println("Listar mamíferos");
            for (Moto moto : Moto.getMotocicleta()) {
                System.out.println(moto);
            }
            System.out.println("Listar répteis");
            for (Bicicleta bicicleta : Bicicleta.getBicicleta()) {
                System.out.println(bicicleta);
            }
        }
   

    public static void listarVagas() {
        System.out.println("Listar alimentações");
        for (Vagas vagas : Vagas.getVagas()) {
            System.out.println(vagas);
        }
    }

    public static void listarLocacacao() {
        System.out.println("Listar limpezas");
        for (Locacao locacao : Locacao.getLocacoes()) {
            System.out.println(locacao);
        }
    }


    public static void removerVeiculo(Scanner scanner) {
        System.out.println("Remover Veiculo");
        System.out.println("Informe a espécie: ");
        String tipo = scanner.next();
        System.out.println("Informe o número do animal:");
        int idVeiculo = scanner.nextInt();
        try {
            switch (tipo) {
                case "C":
                    Carro.removeCarro(idVeiculo);
                    break;
                case "M":
                    Moto.removeMoto(idVeiculo);
                    break;
                case "B":
                    Bicicleta.removeBicicleta(idVeiculo);
                    break;
                default:
                    break;
            }
            System.out.println("Animal removido com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removerVagas(Scanner scanner) {
        System.out.println("Remover Vagas");
        System.out.println("Informe o id da Vaga:");
        int idVagas = scanner.nextInt();
        try {
            Vagas.removeVaga(idVagas);
            System.out.println("Vaga removida com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removerLocacao(Scanner scanner) {
        System.out.println("Remover Locacao");
        System.out.println("Informe o número da Locacao:");
        int idLocacao = scanner.nextInt();
        try {
            Locacao.removeLocacao(idLocacao);
            System.out.println("Locacao removida com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    

    public static void sair() {
        System.out.println("Saindo...");
        System.exit(0);
    }


}


