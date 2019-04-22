package controleremoto;


public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligaMudo();
    public abstract void desligaMudo();
    public abstract void mostrarStatus();
    public abstract void avancarCanal();
    public abstract void voltarCanal();
}
