public class CaixaEletronico {
    
    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 27.00;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.printf("%.2f", saldo);
        }else{
            System.out.println("O valor solicitado é maior do que o saldo!");
        }
    }
}