public class SistemaMedida {
    public static void main(String[] args) {
        String marcas = "G"; //Declarei a minha variavél e atribui

        switch (marcas) { // A partir desse switch, começa nossa comparação
            case "N":{
                System.out.println("NIKE"); // Caso a "marcas" for N, ele vai imprimir "NIKE"
                
                break; // Comando utilizado para parar o processo, caso esteja correto.
            }
            case "Q":{
                System.out.println("QUICKSILVER"); // Caso for "Q" ele vai imprimir "QUICKSILVER"

                break; // Para o processo
            }
            case "H":{
                System.out.println("HANGLOOSE");

                break;
            }
            default: // Encerra nosso sistema
                throw new AssertionError(); // Comando para imprimir a mensagem de erro, caso nenhuma das alternativas esteja correta.
        }
    } // Switch Case Simples
    // Caso não tenha "BREAK" no sistema, ela irá imprimir a próxima mensagem até encerrar o sistema, e o aviso de erro.
    
}
