import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Ruan Victor de Queiros Anastacio";
        String tipoConta = "Corrente";
        double saldo = 2550;

        String dadosIniciais = String.format("""
                **********************************************
                Dados iniciais do cliente:
                
                Nome:             %s
                Tipo conta:       %s
                Saldo inicial:    R$%.2f
                **********************************************""",
                nomeCliente, tipoConta, saldo);

        String operacoes = """
Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair
        
Digite a operação desejada:\s""";

        System.out.println(dadosIniciais);
        System.out.print("\n\n" + operacoes);

        Scanner reader = new Scanner(System.in);
        int opcaoEscolhida = reader.nextInt();

        while (opcaoEscolhida != 4) {
            switch (opcaoEscolhida) {
                default:
                    System.out.println("Opção inválida");
                    break;

                case (1):
                    System.out.println("O saldo atual é R$" + saldo);
                    break;

                case (2):
                    System.out.print("Informe o valor a receber: ");

                    double valorEntrada = reader.nextDouble();
                    saldo += valorEntrada;

                    System.out.println("Saldo atualizado para R$" + saldo);
                    break;

                case (3):
                    System.out.print("Informe quanto deseja transferir: ");

                    double valorSaida = reader.nextDouble();
                    if (valorSaida <= saldo) {
                        saldo -= valorSaida;

                        System.out.println("Saldo atualizado para R$" + saldo);
                    }
                    else {
                        System.out.println("O valor de transferência precisa ser menor do que o seu saldo bancário");
                    }

                    break;
            }

            System.out.print("\n\n" + operacoes);
            opcaoEscolhida = reader.nextInt();
        }
    }
}