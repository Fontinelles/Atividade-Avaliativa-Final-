import java.util.Scanner;
public class CadastroMidias {
    public static void main(String[] args) {
        DVD dvd = new DVD();
        CD cd = new CD();

        System.out.println("Inserir dados para DVD:");
        dvd.inserirDados();
        System.out.println("\nInserir dados para CD:");
        cd.inserirDados();

        System.out.println("\nImprimir dados do DVD:");
        dvd.printDados();
        System.out.println("\nImprimir dados do CD:");
        cd.printDados();
    }

}