import java.util.Scanner;
public class DVD extends Midia {
    private int nFaixas;

    // Construtores
    public DVD() {
        // Construtor sem parâmetros
    }

    public DVD(int c, double p, String s, int f) {
        super(c, p, s);
        nFaixas = f;
    }

    // Métodos

    public String getTipo() {
        return "DVD";
    }


    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    public void setFaixas(int f) {
        nFaixas = f;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de faixas: ");
        nFaixas = scanner.nextInt();
    }

}
