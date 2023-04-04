import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao calculador de salário bruto!");
        System.out.print("Quantas horas você trabalhou este mês? ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Qual é o valor que você ganha por hora trabalhada? R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Qual é o valor do salário família que você recebe? R$ ");
        double salarioFamilia = scanner.nextDouble();

        System.out.print("Quantos filhos com menos de 14 anos você tem? ");
        int numFilhos = scanner.nextInt();

        double salarioBruto = horasTrabalhadas * valorHora;
        double salarioFamiliaTotal = salarioFamilia * numFilhos;

        System.out.printf("Seu salário bruto será de R$ %.2f, incluindo R$ %.2f de salário família. Parabéns pelo trabalho!", salarioBruto + salarioFamiliaTotal, salarioFamiliaTotal);

        scanner.close();
    }
}
