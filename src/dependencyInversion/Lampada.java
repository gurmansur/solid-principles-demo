package dependencyInversion;

public class Lampada implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Lâmpada ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada");
    }
}
