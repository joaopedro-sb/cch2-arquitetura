public class Televisao implements Dispositivo{
    private int canal = 0;

    @Override
    public void ligar() {
        System.out.println("A TV está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("A TV está desligada.");
    }

    @Override
    public void ajustarCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal da TV ajustado para " + canal);
    }
}
