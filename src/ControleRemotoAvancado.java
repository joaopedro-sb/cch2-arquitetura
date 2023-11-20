public class ControleRemotoAvancado extends ControleRemoto {
    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    void ligar() {
        dispositivo.ligar();
        System.out.println("Controle Remoto Avançado: Configurações adicionais ativadas.");
    }

    @Override
    void desligar() {
        dispositivo.desligar();
        System.out.println("Controle Remoto Avançado: Configurações adicionais desativadas.");
    }

    @Override
    void ajustarCanal(int canal) {
        dispositivo.ajustarCanal(canal);
        System.out.println("Controle Remoto Avançado: Canal ajustado para " + canal);
    }
}