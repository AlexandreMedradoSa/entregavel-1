package ehPrimo;

import java.util.Scanner;

public class ehPrimo {
    public static boolean isPrime(int number) {
        // Verifica se o número é menor ou igual a 1, pois números menores que 2 não são
        // primos.
        if (number <= 1) {
            return false;
        }

        // Verifica se o número é igual a 2, que é um número primo.
        if (number == 2) {
            return true;
        }

        // Verifica se o número é divisível por qualquer número de 2 até a sua raiz
        // quadrada.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        // Se não houver divisores encontrados, o número é primo.
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");

        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }

        // Feche o Scanner quando terminar de usá-lo.
        scanner.close();
    }
}
