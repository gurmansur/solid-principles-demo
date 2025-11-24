package dependencyInversion;

public class Interruptor {
    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void acionar(boolean ligar) {
        if (ligar) {
            dispositivo.ligar();
        } else {
            dispositivo.desligar();
        }
    }
}
