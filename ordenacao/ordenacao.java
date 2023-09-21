package ordenacao;

import java.util.Scanner;

public class ordenacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o array de números separados por vírgula: ");

    String input = scanner.nextLine();
    String[] numerosString = input.split(",");

    int[] numeros = new int[numerosString.length];
    for (int i = 0; i < numerosString.length; i++) {
      numeros[i] = Integer.parseInt(numerosString[i].trim());
    }

    quickSort(numeros, 0, numeros.length - 1);

    System.out.print("Array ordenado: ");
    for (int numero : numeros) {
      System.out.print(numero + " ");
    }

    scanner.close();
  }

  // Função Quicksort para ordenar o array
  public static void quickSort(int[] arr, int inicio, int fim) {
    if (inicio < fim) {
      int pivoIndex = partition(arr, inicio, fim);
      quickSort(arr, inicio, pivoIndex - 1);
      quickSort(arr, pivoIndex + 1, fim);
    }
  }

  // Função de partição para o Quicksort
  public static int partition(int[] arr, int inicio, int fim) {
    int pivo = arr[fim];
    int i = inicio - 1;

    for (int j = inicio; j < fim; j++) {
      if (arr[j] <= pivo) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[fim];
    arr[fim] = temp;

    return i + 1;
  }
}
