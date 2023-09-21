package mdc;

import java.util.Scanner;

public class mdc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número (a): ");
    int a = scanner.nextInt();

    System.out.print("Digite o segundo número (b): ");
    int b = scanner.nextInt();

    if (a <= 0 || b <= 0) {
      System.out.println("Por favor, insira valores numéricos positivos.");
    } else {
      int mdc = calcularMDC(a, b);
      System.out.println("O MDC de " + a + " e " + b + " é " + mdc);
    }

    scanner.close();
  }

  // Função para calcular o MDC usando o algoritmo de Euclides
  public static int calcularMDC(int x, int y) {
    while (y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }
    return x;
  }
}
