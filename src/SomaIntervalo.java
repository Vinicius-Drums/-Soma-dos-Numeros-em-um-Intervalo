import java.util.Scanner;

public class SomaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir o início e o fim do intervalo
        System.out.print("Digite o início do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = scanner.nextInt();

        // Verificar se o início é menor ou igual ao fim
        if (inicio > fim) {
            System.out.println("Por favor, insira um intervalo válido.");
            scanner.close(); // Fechar o scanner se o intervalo não for válido
            return;
        }

        // Usar um loop for para somar os números no intervalo
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        // Imprimir o resultado
        System.out.println("A soma dos números no intervalo é: " + soma);

        // Fechar o scanner após o uso
        scanner.close();
    }
}
