public class PlanoTelefone {
    public static void main(String[] args) {
         String plano = "T"; //Declarei a minha Var "plano" e atribui um valor a ela.

         switch (plano){ // Caso plano for "B", ele imprimi uma mensagem.
            case "B":{
                System.out.println("100 Minutos de Ligação");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }

            case "T":{
                System.out.println("5GB Youtube");
            }
    
         }
    }// Switch Case Convencional
    // O sistema está sem o "BREAK", portanto, ele irá executar todas alternativas
    
}
