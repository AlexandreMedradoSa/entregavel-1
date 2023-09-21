package somatorio;

import java.util.Scanner;

public class somatorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite os números separados por vírgula: ");

    String input = scanner.nextLine();
    String[] numerosString = input.split(",");

    double soma = 0;

    for (String numeroStr : numerosString) {
      try {
        double numero = Double.parseDouble(numeroStr);
        soma += numero;
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida: " + numeroStr);
      }
    }

    System.out.println("O somatório dos números é: " + soma);

    scanner.close();
  }
}
