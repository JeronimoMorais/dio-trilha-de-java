public class SmartTv {
    boolean ligada = true;
    int volume = 20;
    int canal = 1;

    public void ligar (){
        ligada = true;
        System.out.println("A TV foi ligada no canal " + canal + " e no volume " + volume + ".");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A TV foi desligada!");
    }

        public void aumentarOVolume(){
            System.out.println("O volume está em " + volume + ".");
            volume++;
            System.out.println("Você aumentou o volume para " + volume + ".");
    }

        public void abaixarOVolume(){
            System.out.println("O volume está em " + volume + ".");
            volume--;
            System.out.println("Você abaixou o volume para " + volume + ".");
    }

    public void mudarDeCanal(int novoCanal){
        canal = novoCanal;
    }
}
