import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("> Digite nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("> Digite o número da agência (xxx-x): ");
        String agencia = sc.nextLine();

        System.out.print("> Digite o número da conta: ");
        Integer numeroConta = sc.nextInt();

        System.out.print("> Digite o valor a depositar: ");
        Double valorDepositar = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, valorDepositar);

        sc.close();
    }

}