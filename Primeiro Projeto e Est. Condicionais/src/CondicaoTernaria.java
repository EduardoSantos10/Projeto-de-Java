public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 10;

        String resultado = nota >= 8 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"; // Vou executar todo processo do bloco em uma só linha.
        // utilizando -> ? "aprov" : "reprov"

        System.out.println(resultado);
    }
    
}// Condição Ternária

// Nessa condição, eu posso executar todo o processo em uma só linha
// Exemplo: 
