import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        System.out.print("Número da conta: ");
        int numeroConta = read.nextInt();
        read.nextLine();
        System.out.print("Número da agencia: ");
        String numeroAgencia = read.nextLine();
        System.out.print("Nome do cliente: ");
        String nome = read.nextLine().toUpperCase();
        System.out.print("Saldo: ");
        double saldo = read.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo RS%.2f já está disponível para saque", nome, numeroAgencia, numeroConta, saldo);

    }
}