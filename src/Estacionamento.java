import java.util.Scanner;

public class Estacionamento {

        public static void cadastrarVeiculo(Scanner scanner) {
        System.out.println("Cadastrar Veiculo");
        
        System.out.println("Digite o tipo: ([C] Carro; [M] Moto; [B] Bicicleta)");
        String tipo = scanner.next();

        switch (tipo) {
            case "C":
            case "c":
            System.out.println("Digite o nome do veiculo: ");
            String nome = scanner.next();
                
                System.out.println("Informe a cor do carro:");
                String cor = scanner.next();
               
            try {
                System.out.println("Informe a placa do Carro:");
                String  placa= scanner.next();
                
                new Carro (nome, placa, cor);
                System.out.println("Carro cadastrado com sucesso!");
                
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            
            case "M":
            case "m":
            System.out.println("Digite o nome do veiculo: ");
            nome = scanner.next();
            System.out.println("Informe a placa da moto:");
            String placa= scanner.next();
            System.out.println("Informe a cilindrada da moto:");
            String cilindrada = scanner.next();
        
            try {

            new Moto (nome, placa,cilindrada);
            System.out.println("Moto cadastrada com sucesso!");
        
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
                break;
            case "B":
            case "b":
            System.out.println("Digite o nome do veiculo: ");
            nome  = scanner.next();
                System.out.println("Informe a marca da bicicleta:");
                String marca = scanner.next();
                System.out.println("Informe a cor da bicleta:");
                String cor1 = scanner.next();
                try {
                    new Bicicleta(nome,marca,cor1 );
                    System.out.println("Bicicleta cadastrada com sucesso!");
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            
        }
    }

    public static void cadastrarVaga(Scanner scanner) {
        System.out.println("Cadastrar vaga");
        System.out.println("Digite o id da vaga:");
        int id = scanner.nextInt();
        System.out.println("Infome o número da vaga");
        String numero = scanner.next();
        System.out.println("Digite o tipo da vaga [C] Carro; [M] Moto; [B] Bicicleta:");
        String tipo = scanner.next();
        System.out.println("Digita o tamanho da vaga:");
        int tamanho = scanner.nextInt();
        System.out.println("Digite o valor da vaga:");
        Double valor = scanner.nextDouble();
        try {
            new Vagas(id, numero, tipo, tamanho, valor);
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
            case "c":
            System.out.println("Informe o id do carro");
            int idCarro = scanner.nextInt();
            Carro.verificaId(idCarro);
            System.out.println("Informe o id da vaga:");

            int idVaga = scanner.nextInt();
            
            new Locacao(id, data, idCarro, idVaga); 
            System.out.println("Locacao cadastrada com sucesso");
            break;
            
            case "M":
            case "m":
            System.out.println("Informe o id do carro");
            int idMoto = scanner.nextInt();
            Moto.verificaId(idMoto);
            System.out.println("Informe o id da vaga:");
            int idVagas = scanner.nextInt();
            Vagas.verificaVaga(idVagas);
            new Vagas(id, data, tipo, idMoto, idVagas);
            System.out.println("Locacao cadastrada com sucesso");
            break;
            
            
            case "B":
            case "b":
            System.out.println("Informe o id da bicicleta");
            int idBic = scanner.nextInt();
            Bicicleta.verificaId(idBic);
            System.out.println("Informe o id da vaga:");
             idVaga = scanner.nextInt();
            Vagas.verificaVaga(idVaga);
            new Vagas(id, data, tipo, idBic, idVaga);
            System.out.println("Locacao cadastrada com sucesso");
            
        }
        
            
        }

        public static void listarVeiculo() {
            System.out.println("Listar Carro");
            for (Carro carro : Carro.getCarros()) {
                System.out.println(carro);
            }
            System.out.println("Listar Moto");
            for (Moto moto : Moto.getMotocicleta()) {
                System.out.println(moto);
            }
            System.out.println("Listar Biscicleta");
            for (Bicicleta bicicleta : Bicicleta.getBicicleta()) {
                System.out.println(bicicleta);
            }
        }
   

    public static void listarVagas() {
        System.out.println("Listar Vagas");
        for (Vagas vagas : Vagas.getVagas()) {
            System.out.println(vagas);
        }
    }

    public static void listarLocacao() {
        System.out.println("Listar limpezas");
        for (Locacao locacao : Locacao.getLocacoes()) {
            System.out.println(locacao);
        }
    }


    public static void removerVeiculo(Scanner scanner) {
        System.out.println("Remover Veiculo");
        System.out.println("Informe o Tipo do Veiculo [C] Carro, [M] Moto, [B] Bicicleta: ");
        String tipo = scanner.next();
        System.out.println("Informe ID do veiculo:");
        int idVeiculo = scanner.nextInt();
        try {
            switch (tipo) {
                case "C":
                case "c":
                    Carro.removeCarro(idVeiculo);
                    break;
                case "M":
                case "m":
                    Moto.removeMoto(idVeiculo);
                    break;
                case "B":
                case "b":
                    Bicicleta.removeBicicleta(idVeiculo);
                    break;
                default:
                    break;
            }
            System.out.println("Veiculo removido com sucesso!");
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
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Estacionamento: ");


        do {
            System.out.println("O que deseja fazer?");
            System.out.println("[1]  - Cadastrar Veiculo");
            System.out.println("[2]  - Cadastrar Vaga");
            System.out.println("[3]  - Cadastrar Locação");
            System.out.println("[4]  - Listar Veiculo");
            System.out.println("[5]  - Listar Vaga");
            System.out.println("[6] - Listar Locação");
            System.out.println("[7] - Remover Carro");
            System.out.println("[8] - Remover Moto");
            System.out.println("[9] - Remover Bicicleta");
            System.out.println("[10] - Remover vaga");
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
                listarLocacao();
                    break;
                case 7:
                removerVeiculo(scanner);
                    break;
                case 8:
                removerVagas(scanner);
                    break;
                case 9:
                removerLocacao(scanner);
                    break;
                case 10:
                sair();
                    break;
                default:
                System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 13);
        
    }



}


