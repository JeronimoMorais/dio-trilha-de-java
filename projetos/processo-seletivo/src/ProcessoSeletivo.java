public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidatura(1500.0);
        analisarCandidatura(2000.0);
        analisarCandidatura(2200.0);
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
