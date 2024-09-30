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

        
    
    }
    
}
