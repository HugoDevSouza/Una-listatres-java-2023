import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o total de veículos: ");
        int totalVeiculos = scanner.nextInt();
        
        System.out.print("Digite o total de rodas: ");
        int totalRodas = scanner.nextInt();
        
        int totalMotos = (totalRodas - (totalVeiculos * 4)) / 2;
        int totalCarros = totalVeiculos - totalMotos;
        
        System.out.println("Total de carros: " + totalCarros);
        System.out.println("Total de motos: " + totalMotos);
        
        scanner.close();
    }
}