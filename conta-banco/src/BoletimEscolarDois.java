public class BoletimEscolarDois {
    public static void main(String[] args) {
            int nota = 10;
    
            if( nota >= 8) // Quando a minha condição tem dois argumentos
                System.out.println("Você passou!"); // primeira condição

            else if (nota >= 5 && nota < 7) // adicionei uma condição "else-if" e posso adicionar mais. 
            System.out.println("Você está de recuperação!");
    
            else // ultima condição
                System.out.println("Você foi reprovado!");
         
    }
    
}// Condição encadeada
