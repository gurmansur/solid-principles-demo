package interfaceSegregation;

public class Funcionario implements Trabalhador, Bebedor {
    @Override
    public void trabalhar() {
        System.out.println("Funcionário: Trabalhando!");
    }

    @Override
    public void beberAgua() {
        System.out.println("Funcionário: Bebendo água!");
    }
}
