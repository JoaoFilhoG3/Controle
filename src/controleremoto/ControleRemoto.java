package controleremoto;

public class ControleRemoto {

    public static void main(String[] args) {
        ControleTV ctv = new ControleTV();
        ctv.setCanal(30);
        ctv.ligar();
        ctv.maisVolume();
        ctv.avancarCanal();
        ctv.mostrarStatus();

        ControleSom cs = new ControleSom();
        cs.ligar();
        cs.maisVolume();
        cs.avancarCanal();
        cs.mostrarStatus();
    }

}
