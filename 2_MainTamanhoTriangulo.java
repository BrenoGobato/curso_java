import java.util.Scanner;
import entities.Retangulo;


public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o altura do retangulo: ");
        retangulo.altura = sc.nextDouble();
        System.out.print("Digite o largura do retangulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.println(retangulo);

    }
}
