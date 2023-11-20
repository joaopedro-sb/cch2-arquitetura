class Radio implements Dispositivo {
    private int estacao = 0;

    @Override
    public void ligar() {
        System.out.println("O rádio está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O rádio está desligado.");
    }

    @Override
    public void ajustarCanal(int estacao) {
        this.estacao = estacao;
        System.out.println("Estação do rádio ajustada para " + estacao);
    }
}
