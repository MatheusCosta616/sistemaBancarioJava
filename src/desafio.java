import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        //declaração de inicial
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String tipoDeConta = "Corrente";
        double saldoIni = 0;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite o seu saldo de sua conta: ");
        saldoIni = scanner.nextDouble();

        System.out.println("*********************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo Inicial: R$" + saldoIni);
        System.out.println("*********************");
       System.out.println("""
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                                         
                """);
        //declaração do scanner

        //ações do usuário
        int acao = 0;
        String resp = "";
        System.out.println("Digite a opção desejada");
        acao = scanner.nextInt();

        //estrutura de repetição
    while (acao != 6) {
        //menu inicial
        if (acao == 0) {
            System.out.println("""
                    Operações
                                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                                             
                    """);
            System.out.println("Digite a opção desejada");
            acao = scanner.nextInt();
            //acao 1
        }else if (acao == 1) {
            System.out.println("Aqui está seu saldo atual!");
            System.out.println(saldoIni);
            System.out.printf("Deseja fazer mais alguma coisa? (sim ou não)");
            scanner.nextLine();
            resp = scanner.nextLine();
            if (resp.toLowerCase().equals("sim")) {
                acao = 0;
            } else if (resp.toLowerCase().equals("nao")) {
                acao = 6;
            }
            // acao 2
        } else if (acao == 2) {
            double valReceb = 0;
            System.out.println(("informe o valor a receber"));
            valReceb = scanner.nextDouble();
            double valFinal = saldoIni += valReceb;
            System.out.println("Seu saldo atual R$" + valFinal);
            System.out.printf("Deseja fazer mais alguma coisa? (sim ou não)");
            scanner.nextLine();
            resp = scanner.nextLine();
            if (resp.toLowerCase().equals("sim")) {
                acao = 0;
            } else if (resp.toLowerCase().equals("nao")) {
                acao = 6;
            }
            //acao 3
        } else if (acao == 3) {
            String valRecebStr ="";
            System.out.println(("""
            informe o valor a ser transferido
            caso queira transerir tudo digite (tudo);
            """));
            valRecebStr = scanner.next(); // pede ao usuário para inserir um valor
            if (valRecebStr.toLowerCase().equals("tudo")){
                saldoIni -= saldoIni;
                System.out.printf("Tudo foi transferido!");
            } else {
                double valReceb = Double.parseDouble(valRecebStr);
                double valFinal = saldoIni - valReceb;
                System.out.println("Valor transferido!");
                System.out.println("Seu saldo atual R$" + valFinal);
            }
            scanner.nextLine();
            System.out.printf("Deseja fazer mais alguma coisa? (sim ou não)");
            resp = scanner.nextLine();
            if (resp.toLowerCase().equals("sim")) {
                acao = 0;
            } else if (resp.toLowerCase().equals("nao")) {
                acao = 6;
            }
            //acao 4 (sair)
        } else if (acao == 4) {
            String cert = "";
            System.out.printf("Tem certeza? (sim ou não)");
            cert = scanner.next();
            if (cert.toLowerCase().equals("sim")){
                acao = 6;
            } else if (cert.toLowerCase().equals("nao")) {
                acao = 0;
            }
        }
    }
        System.out.printf("""
                oque você achou do serviço?
                
                1 - ruim
                2 - regular
                3 - bom
                4 - ótimo
                """);
        int resp2 = 0;
        resp2 = scanner.nextInt();
        System.out.printf("""
        Obrigado pela resposta!
        Operação finalizada!
        """);
    }

}

