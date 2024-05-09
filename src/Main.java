import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeDigitado = leitura.nextLine();

        int opcao = 0;
        String corrente = "Conta Corrente";
        String poupanca = "Conta Poupança";
        String tipoConta = """
                Digite o tipo da conta:
                1- Conta Corrente
                2- Conta Poupança""";
        String inicio = """
                Bem Vindo!
                *****************************
                        
                Dados Iniciais do Cliente:
                *****************************
                """;

        System.out.println("Digite seu saldo: ");
        double saldo = leitura.nextDouble();

        System.out.println(tipoConta);
        int contaDigitada = leitura.nextInt();

        if (contaDigitada == 1) {
            System.out.println(inicio);
            System.out.println("Nome:..........." + nomeDigitado);
            System.out.println("Tipo Conta:....." + corrente);
            System.out.println("Saldo:..........R$" + saldo);
        } else if (contaDigitada == 2) {
            System.out.println(inicio);
            System.out.println("Nome:..........." + nomeDigitado);
            System.out.println("Tipo Conta:....." + poupanca);
            System.out.println("Saldo:..........R$" + saldo);
        } else {
            System.out.println(tipoConta);
        }

        String menu = """
                        
                ** Digite sua Opção **
                        
                1- Consultar Saldo
                2- Transferir Valor
                3- Receber Valor
                4- Sair
                        
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é de R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valorTransfer = leitura.nextDouble();
                if (valorTransfer > saldo) {
                    System.out.println("Não há saldo para transferência.");
                } else {
                    saldo -= valorTransfer;
                    System.out.println("Novo saldo: R$" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: R$" + saldo);

            } else if (opcao != 4) {
                System.out.println("Opção inválida");
                }
            }
        }
    }
