package controleremoto;

public class ControleSom implements Controlador{
   private int volume;
   private boolean ligado;
   private int frequencia;
   
   public ControleSom(){
       this.volume = 0;
       this.ligado = false;
       this.frequencia = 90;
   }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void maisVolume() {
        this.setVolume(this.getVolume() + 5);
    }

    @Override
    public void menosVolume() {
        this.setVolume(this.getVolume() - 5);
    }

    @Override
    public void ligaMudo() {
        this.setVolume(0);
    }

    @Override
    public void desligaMudo() {
        this.setVolume(20);
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Frequência: " + this.getFrequencia());
    }

    @Override
    public void avancarCanal() {
        this.setFrequencia(this.getFrequencia() + 10);
    }

    @Override
    public void voltarCanal() {
        this.setFrequencia(this.getFrequencia() - 10);
    }
   
   
}
