    public class CaixaEletronico { // criei a classe CaixaEletronico
    public static void main(String[] args){ // Fiz o método "main" para executar o código
        
        // declarei as variavéis
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        // Fiz a condicional simples "If"
        if(valorSolicitado < saldo){ // Faço a comparação de valores

            saldo = saldo - valorSolicitado; // Executo uma subtração
            System.out.println("Seu saldo é: " + saldo); // Adição de um bloco
        }else 
            // System.out.println("Saldo insuficiente!"); // Opção caso fosse add uma condic. composta.


            System.out.println(saldo);// Imprimo seu resultado
        
        // Se o valor solicitado for menor que saldo, é uma condição verdadeira e meu bloco de código é executado   
    }
    
}// Condição Simples
// Se dentro da condição, eu tiver mais de uma instrução, eu coloco meu código em um bloco "IF" {}
// No caso do "Else", eu posso manter sem bloco por ter uma linha. Mas caso ele tenha mais de uma condição, eu adiciono um bloco{}
// Tudo que é executado no bloco é somente se a minha condição for verdadeira
