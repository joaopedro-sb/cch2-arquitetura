public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new Televisao();
        Dispositivo radio = new Radio();

        ControleRemoto controleRemotoSimples = new ControleRemotoSimples(tv);
        ControleRemoto controleRemotoAvancado = new ControleRemotoAvancado(radio);

        controleRemotoSimples.ligar();
        controleRemotoSimples.ajustarCanal(5);
        controleRemotoSimples.desligar();

        System.out.println("-----");

        controleRemotoAvancado.ligar();
        controleRemotoAvancado.ajustarCanal(102);
        controleRemotoAvancado.desligar();
    }
}