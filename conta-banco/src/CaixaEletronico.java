public class CaixaEletronico { // criei a classe CaixaEletronico
    public static void main(String[] args){ // Fiz o método "main" para executar o código
        
        // declarei as variavéis
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        // Fiz a condicional simples "If"
        if(valorSolicitado < saldo){ // Faço a comparação de valores

            saldo = saldo - valorSolicitado; // Executo uma subtração

            System.out.println(saldo);// Imprimo seu resultado
        }
        // Se o valor solicitado for menor que saldo, é uma condição verdadeira e meu bloco de código é executado   
    }
    
}
