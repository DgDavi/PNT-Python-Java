import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double mediaSimples = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média simples: %.2f%n", mediaSimples);

        double mediaPonderada1 = (nota1 * 2 + nota2 * 2 + nota3 * 3) / 7;
        System.out.printf("Média ponderada (pesos 2, 2, 3): %.2f%n", mediaPonderada1);

        double mediaPonderada2 = (nota1 * 1 + nota2 * 2 + nota3 * 2) / 5;
        System.out.printf("Média ponderada (pesos 1, 2, 2): %.2f%n", mediaPonderada2);

        scanner.close();
    }
}