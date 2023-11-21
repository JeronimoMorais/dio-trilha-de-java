public class Usuario {
    public static void main(String[] args){     

        SmartTv smt = new SmartTv();
        
        System.out.println("Minha Smart TV está ligada? " + smt.ligada);
        
        System.out.println("Em qual canal ela está ligada? " + smt.canal);
        smt.mudarDeCanal(13);
        System.out.println("Você mudou para o canal: " + smt.canal + ".");

        smt.aumentarOVolume();
        
        smt.abaixarOVolume();

        if(smt.ligada == false){
            smt.ligar(); 
        }else{
            smt.desligar();
        }
    }
}
