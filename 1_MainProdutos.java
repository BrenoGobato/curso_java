import java.util.Locale;
import java.util.Scanner;
 
import entities.Produto;
 
public class Main {
 
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        //Locale.setDefault(Locale.US);
        int opcao;
 
        Produto produto = new Produto();
 
        System.out.println("Digite o dado do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.next();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantidade = sc.nextInt();
        System.out.println();

        do{
            System.out.println("Digite o numero da opcao desejada: \n\n1- Add quantidade\n2 - Rem quantidade");
            opcao = sc.nextInt();
            switch (opcao) {
                case (1):
                    System.out.print("Digite o numeros de produtos a serem adicionados ao estoque: ");
                    int quantidade = sc.nextInt();
                    produto.addProdutos(quantidade);
                    System.out.println("Dados atualizados: " + produto);
                    break;
                case (2):
                    System.out.print("Digite o numero de produtos a serem removidos: ");
                    quantidade = sc.nextInt();
                    produto.remProdutos(quantidade);
                    System.out.printf("Dados atualizados: " + produto);
                    break;
                default:
                    System.out.printf("Opcao Invalida!");
            }
        }while (opcao != 0);
        sc.close();
    }
}
