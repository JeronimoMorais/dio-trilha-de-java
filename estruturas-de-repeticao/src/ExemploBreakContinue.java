public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int carneirinhos = 0; carneirinhos <= 1000; carneirinhos ++){
            
            if(carneirinhos%5 != 0)
                continue;
            System.out.println(carneirinhos);
        }
    }
}
