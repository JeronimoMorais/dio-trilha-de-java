import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da conta: ");
            numero = sc.nextInt();
            while(numero <= 0){
                System.out.println("Valor inválido! Por favor, digite novamente: ");
                numero = sc.nextInt();
            }
        
        System.out.println("Por favor, digite a sua agência: ");
            agencia = sc.next();

        System.out.println("Por favor, digite seu nome, aperte ENTER, e digite seu sobrenome: ");
            nomeCliente = sc.next().toUpperCase().concat(" " + sc.next().toUpperCase());

        System.out.println("Por favor, digite seu saldo bancário: ");
            saldo = sc.nextDouble();
            if(saldo <= 0){
                System.out.printf("Olá, ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco! Sua agência é ").concat(agencia).concat(", sua conta é ") + numero + " e seu saldo é de R$ %.2f . Você não tem saldo disponível para saque.", saldo);
            }else{
                System.out.printf("Olá, ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco! Sua agência é ").concat(agencia).concat(", sua conta é ") + numero + " e seu saldo de R$ %.2f já está disponível para saque.", saldo);
            }

        sc.close();
    }
}
