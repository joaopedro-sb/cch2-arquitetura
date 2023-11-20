abstract class ControleRemoto {
    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    abstract void ligar();
    abstract void desligar();
    abstract void ajustarCanal(int canal);
}