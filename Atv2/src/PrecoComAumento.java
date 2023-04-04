import java.util.Scanner;

public class PrecoComAumento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto custa o produto?");
        double preco = scanner.nextDouble();

        double novoPreco = preco * 1.1; // calcula o novo preço com acréscimo de 10%

        System.out.printf("O novo preço do produto é %.2f!", novoPreco);

        scanner.close();
    }
}


