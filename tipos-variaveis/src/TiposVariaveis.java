public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        short numeroCurto = 1;
        int numerNormal = numeroCurto;
        //short numeroCurto2 = numerNormal; não é permitido este formato porque o tipo INT é maior do que o SHORT
        short numeroCurto2 = (short) numerNormal; //ao fazer um CASTING a expressão fica correta.
    }
}
