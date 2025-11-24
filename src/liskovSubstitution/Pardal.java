package liskovSubstitution;

public class Pardal extends Passaro implements Voador {
    @Override
    public void voar() {
        System.out.println("Pardal: Estou voando!");
    }
}
