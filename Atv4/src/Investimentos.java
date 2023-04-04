import java.util.Scanner;

public class Investimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular os juros compostos da sua aplicação financeira!");

        System.out.print("Qual é o valor que você quer investir? R$ ");
        double capital = scanner.nextDouble();

        System.out.print("Por quantos meses você quer deixar o dinheiro rendendo? ");
        int prazo = scanner.nextInt();

        System.out.print("Qual é a taxa de juros mensal que você conseguiu? (em %) ");
        double taxa = scanner.nextDouble() / 100.0;

        double montante = capital * Math.pow(1 + taxa, prazo); // calcula o montante

        System.out.printf("Seu investimento de R$ %.2f, após %d meses a uma taxa de %.2f%%, renderá R$ %.2f!", capital, prazo, taxa*100, montante);

        scanner.close();
    }
}