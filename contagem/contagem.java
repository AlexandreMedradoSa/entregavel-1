package contagem;

import java.util.Scanner;

public class contagem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o valor de N: ");

    int n = scanner.nextInt();

    if (n <= 0) {
      System.out.println("Por favor, insira um valor válido para N (N > 0).");
    } else {
      // Solicita ao usuário que insira N valores de entrada
      int[] valores = new int[n];
      for (int i = 0; i < n; i++) {
        System.out.print("Digite o " + (i + 1) + "º valor: ");
        valores[i] = scanner.nextInt();
      }

      // Identifica automaticamente o primeiro dado
      int primeiroDado = valores[0];

      // Conta quantos valores estão no intervalo entre o primeiro dado e N
      int contador = 0;
      for (int i = 0; i < n; i++) {
        if (valores[i] >= primeiroDado && valores[i] <= n) {
          contador++;
        }
      }

      System.out.println(
          "Existem " + contador + " valores inteiros entre " + primeiroDado + " (inclusive) e " + n + " (inclusive).");
    }

    scanner.close();
  }
}