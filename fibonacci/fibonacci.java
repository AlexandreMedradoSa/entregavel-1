package fibonacci;

import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o valor de N (N > 1): ");

    int n = scanner.nextInt();

    if (n <= 1) {
      System.out.println("Por favor, insira um valor válido para N (N > 1).");
    } else {
      int termo1 = 0;
      int termo2 = 1;

      System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
      System.out.println(termo1);
      System.out.println(termo2);

      for (int i = 2; i < n; i++) {
        int proximoTermo = termo1 + termo2;
        System.out.println(proximoTermo);
        termo1 = termo2;
        termo2 = proximoTermo;
      }
    }

    scanner.close();
  }
}
