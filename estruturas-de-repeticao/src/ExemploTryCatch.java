import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Por favor, digite o seu nome:");
            String nome = sc.next();

            System.out.println("Por favor, digite o seu sobrenome:");
            String sobrenome = sc.next();

            System.out.println("Por favor, digite a sua idade:");
            int idade = sc.nextInt();

            System.out.println("Por favor, digite a sua estatura:");
            double estatura = sc.nextDouble();

            System.out.println("Meu nome é " + nome + " " + sobrenome + ".");
            System.out.println("Minha idade é " + idade + " anos e minha estatura é " + estatura + "m.");

            sc.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e estatura precisam ser númericos.");
        }
    }
}
