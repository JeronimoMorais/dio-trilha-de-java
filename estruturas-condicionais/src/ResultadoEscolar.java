public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota1 = 2;
        double nota2 = 7;
        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("O aluno foi APROVADO!");
        }else if(6.0 <= media && media <= 6.9){
            System.out.println("O aluno em RECUPERAÇÃO!");
        }else{
            System.out.println("O aluno foi REPROVADO!");
        }

        String resultado = media >= 7 ? "Aprovado!" : "Reprovado";

        System.out.println(resultado);
    }
}
