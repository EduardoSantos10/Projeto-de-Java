import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner bancaria = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da sua conta: ");
        numero = bancaria.nextInt();

        System.out.println("Digite o número da sua agência: ");
        agencia = bancaria.next();

        System.out.println("Digite o seu nome: ");
        nomeCliente = bancaria.next();

        System.out.println("O seu saldo é: ");
        saldo = bancaria.nextDouble();

        System.out.println("Olá\n" + nomeCliente + "\nobrigado por criar uma conta em nosso banco, sua agência é:\n " + agencia + "\nconta:\n " + numero + "\ne seu saldo é:\n " + saldo + "\njá está disponivel para saque!");
    
        bancaria.close();
    }

}
