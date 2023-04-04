import java.util.Scanner;

public class Logaritmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = Math.log(numero1) / Math.log(numero2);

        System.out.printf("O logaritmo de %.2f na base %.2f é %.2f", numero1, numero2, resultado);

        scanner.close();
    }
}