public class SistemaDeMedida {
    public static void main(String[] args) {
        
        String tamanho = "p";

        switch (tamanho) {
            case "p":
                System.out.println("O tamanho é PEQUENO.");
                break;
            
            case "m":
                System.out.println("O tamanho é MÉDIO!");
                break;

            case "g":
                System.out.println("O tamanho é GRANDE!");
                break;
        
            default:
                System.out.println("Você não definiu um tamanho específico!");
                break;
        }
    }
}
