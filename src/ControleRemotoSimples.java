public class ControleRemotoSimples extends ControleRemoto {
    public ControleRemotoSimples(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    void ligar() {
        dispositivo.ligar();
    }

    @Override
    void desligar() {
        dispositivo.desligar();
    }

    @Override
    void ajustarCanal(int canal) {
        dispositivo.ajustarCanal(canal);
    }
}