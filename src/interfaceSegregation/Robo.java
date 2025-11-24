package interfaceSegregation;

public class Robo implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Robô: Processando!");
    }
}
