import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o valor do déposito inicial: ");
        var firstDeposit = scanner.nextDouble();
        bankAccount conta = new bankAccount(firstDeposit);

        int opcao;

        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.checkBalance();
                    break;
                case 2:
                    conta.checkOverdraft();
                    break;
                case 3:
                    System.out.println("Valor para o depósíto: ");
                    double depositAmount = scanner.nextDouble();
                    conta.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Valor para o saque: ");
                    double withdrawAmount = scanner.nextDouble();
                    conta.withdraw(withdrawAmount);
                    break;
                case 5:
                    System.out.println("Valor do boleto: ");
                    double paySlipValue = scanner.nextDouble();
                    conta.payBankSlip(paySlipValue);
                    break;
                case 0:
                    System.err.println("Encerrando...");
                    break;        
                default:
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
