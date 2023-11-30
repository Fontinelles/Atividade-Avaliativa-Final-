import java.util.Scanner;
public class Midia {

    protected int codigo;
    protected double preco;
    protected String nome;

    // Construtores
    public Midia() {
        // Construtor sem parâmetros
    }

    public Midia(int c, double p, String n) {
        codigo = c;
        preco = p;
        nome = n;
    }

    // Métodos
    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Detalhes: " + getDetalhes());
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o código: ");
        codigo = scanner.nextInt();
        System.out.println("Informe o preço: ");
        preco = scanner.nextDouble();
        System.out.println("Informe o nome: ");
        nome = scanner.next();
    }
}
