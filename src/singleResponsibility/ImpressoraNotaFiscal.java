package singleResponsibility;

public class ImpressoraNotaFiscal {
    public void imprimirNotaFiscal(double valorOriginal, double valorFinal) {
        System.out.println("\n========== NOTA FISCAL ==========");
        System.out.println("Valor Original: R$ " + String.format("%.2f", valorOriginal));
        System.out.println("Desconto (10%): R$ " + String.format("%.2f", valorOriginal * 0.1));
        System.out.println("Valor Final: R$ " + String.format("%.2f", valorFinal));
        System.out.println("=================================\n");
    }
}
