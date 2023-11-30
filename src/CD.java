import java.util.Scanner;
public class CD extends Midia{
    private int nMusicas;

    // Construtores
    public CD() {
        // Construtor sem parâmetros
    }

    public CD(int c, double p, String s, int m) {
        super(c, p, s);
        nMusicas = m;
    }

    // Métodos

    public String getTipo() {
        return "CD";
    }


    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    public void setMusicas(int m) {
        nMusicas = m;
    }


    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de músicas: ");
        nMusicas = scanner.nextInt();
    }
}
