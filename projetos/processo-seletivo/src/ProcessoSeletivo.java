import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
        // analisarCandidatura(1500.0);
        // analisarCandidatura(2000.0);
        // analisarCandidatura(2200.0);

        // selecaoCandidatos();

        imprimirCandidatosSelecionados();
    }

    static void imprimirCandidatosSelecionados(){
        String[] candidatoSelecionados = {"JERONIMO", "IZABEL", "ADRIANO", "RAFAEL", "PAOLA"};

        System.out.println("Imprimindo a lista de candidatos pelo íncide do elemento.");

        for(int indice = 0; indice < candidatoSelecionados.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o candidato " + candidatoSelecionados[indice] + " selecioinado.");
        }

        System.err.println("\nImprimindo a lista de nomes dos candidatos selecionados.");

        for (String candidato : candidatoSelecionados) {
            System.out.println("O candidato " + candidato + " foi selcionado.");
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"JERONIMO", "IZABEL", "ADRIANO", "RAFAEL", "PAOLA", "CECILIA", "LUCAS", "MARTA", "ANTONIO", "BRISA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioOfertado = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioRequerido = valorDesejado();

                System.out.printf("O candidato " + candidato + " requereu o salário R$ %.2f.\n", salarioRequerido);
                if(salarioOfertado >= salarioRequerido){
                    System.out.println("O candidato " + candidato + " foi selecionado!");
                    candidatosSelecionados++;
                }
                candidatoAtual++;
        }
    }

    static double valorDesejado(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidatura(double salarioDesejado){
        double salarioOferecido = 2000.0;
        if(salarioDesejado < salarioOferecido){
            System.out.println("LIGAR PARA O CANDIDATO!");
        }
        else if(salarioDesejado == salarioOferecido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRAPROPOSTA!");
        }
        else{System.out.println("AGUARDAR RESULTADO DAS OUTRAS CANDIDATURAS!");}
    }
}
