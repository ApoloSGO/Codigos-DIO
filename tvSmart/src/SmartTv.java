public class SmartTv {
    // one line//
    /*
     * documentação
     * varias linhas
     */
    boolean ligada=false;
    int canal=1;
    int volume=5;

    public void mudarDeCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        //volume = volume+1;
        volume++;
    }
    public void diminuirVolume(){

        volume--;
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
