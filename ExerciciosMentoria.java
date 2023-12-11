import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1 - Aumento Percentual
        System.out.print("Digite o valor inicial (A): ");
        double valorInicial = scanner.nextDouble();
        System.out.print("Digite o valor atualizado (B): ");
        double valorAtualizado = scanner.nextDouble();
        exibirPercentualAumento(valorInicial, valorAtualizado);

        // Exercício 2 - Contar Vogais
        scanner.nextLine();
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int quantidadeVogais = contarVogais(frase);
        System.out.println("Quantidade de vogais: " + quantidadeVogais);

        //Exercicio 3 - Numeros Pares
        System.out.print("Digite um número inteiro para encontrar os números pares até ele: ");
        int n = scanner.nextInt();
        System.out.print("Números pares até " + n + ": ");
        encontrarNumerosPares(n);

        // Exercício 4 - Área do Círculo
        int raio = 8;
        double area = calcularAreaCirculo(raio);
        System.out.println("Área do círculo com raio " + raio + ": " + area);

        scanner.close();
    }

    public static void exibirPercentualAumento(double valorInicial, double valorAtualizado) {
        double aumento = ((valorAtualizado - valorInicial) / valorInicial) * 100;
        System.out.println("Aumento de " + aumento + "%");

    }

    public static int contarVogais(String frase) {
        int count = 0;
        for (char c : frase.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void encontrarNumerosPares(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static double calcularAreaCirculo(int raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}
