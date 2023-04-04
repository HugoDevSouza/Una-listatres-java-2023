import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: R$");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas realizadas no mês: R$");
        double valorVendas = scanner.nextDouble();

        System.out.print("Digite o percentual de comissão sobre as vendas (em %): ");
        double percentualComissao = scanner.nextDouble();

        double comissao = valorVendas * (percentualComissao / 100);
        double salarioTotal = salarioFixo + comissao;

        System.out.printf("O salário total do vendedor é R$%.2f", salarioTotal);

        scanner.close();
    }
}