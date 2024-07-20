import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inserir o número da agência
        System.out.print("Por favor, digite o número de sua agência: ");
        String numeroAgencia = scanner.nextLine();

        // Inserir o nome do cliente
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Digitar o número da conta
        System.out.print("Por favor, digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        // Digitar o saldo da conta
        System.out.print("Por favor, digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        // Exibe a mensagem final com as informações coletadas
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, numeroAgencia, numeroConta, saldoConta);

        // Fecha o scanner
        scanner.close();
    }
}