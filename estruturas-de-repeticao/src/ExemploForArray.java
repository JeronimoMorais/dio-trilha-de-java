public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Aluno A", "Aluno B", "Aluno C", "Aluno D"};

        for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no índice i = " + i + " é o " + alunos[i]);
        }

        // forEach
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
