package controleremoto;

public class ControleTV implements Controlador {
    private int volume;
    private boolean ligado;
    private int canal;
    
    public ControleTV(){
        this.volume = 0;
        this.ligado = false;
        this.canal = 0;
        
    }
    public int getVolume(){
      return this.volume;
      
    }
    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
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
        this.setVolume(this.getVolume() + 10);
    }

    @Override
    public void menosVolume() {
      this.setVolume(this.getVolume() - 10);  
    }

    @Override
    public void ligaMudo() {
        this.setVolume(0);
    }

    @Override
    public void desligaMudo() {
        this.setVolume(50);
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Canal: " + this.getCanal());
    } 

    @Override
    public void avancarCanal() {
        this.setCanal(this.getCanal() + 1);
        
    }

    @Override
    public void voltarCanal() {
        this.setCanal(this.getCanal() - 1);
    }
    
}
