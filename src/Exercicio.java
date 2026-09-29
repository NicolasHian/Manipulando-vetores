import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Ordenar números =====
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor:");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Ordenado: " + Arrays.toString(vetor));

        // ===== Ordenar palavras =====
        System.out.println("Digite o tamanho do vetor:");
        int tamanho2 = sc.nextInt();
        sc.nextLine();
        String[] vetor2 = new String[tamanho2];

        for (int i = 0; i < tamanho2; i++) {
            System.out.println("Digite a palavra da posição " + i + " do vetor:");
            vetor2[i] = sc.nextLine();
        }

        for (int i = 0; i < vetor2.length; i++) {
            for (int j = i + 1; j < vetor2.length; j++) {
                if (vetor2[j].compareTo(vetor2[i]) < 0) {
                    String aux = vetor2[i];
                    vetor2[i] = vetor2[j];
                    vetor2[j] = aux;
                }
            }
        }
        System.out.println("Ordenado: " + Arrays.toString(vetor2));

        // ===== Exercício 2 =====
        EX2(sc);   // chama o método
        EX3(sc);
        sc.close();
    }   // fim do main


    public static void EX2(Scanner sc) {
        System.out.println("Digite o tamanho do vetor:");
        int tamanho3 = sc.nextInt();
        int[] vetor3 = new int[tamanho3];

        for (int i = 0; i < tamanho3; i++) {
            System.out.println("Digite o número da posição " + i + " do vetor:");
            vetor3[i] = sc.nextInt();
        }

        // mostrando os pares
        System.out.print("Pares: ");
        for (int i = 0; i < tamanho3; i++) {
            if (vetor3[i] % 2 == 0) {
                System.out.print(vetor3[i] + " ");
            }
        }
        System.out.println();

        // mostrando os ímpares
        System.out.print("Ímpares: ");
        for (int i = 0; i < tamanho3; i++) {
            if (vetor3[i] % 2 != 0) {
                System.out.print(vetor3[i] + " ");
            }
        }
        System.out.println();
    }
    public static void EX3(Scanner sc) {
        System.out.println("Digite Um nome:");
        String nome = sc.nextLine();

        while (nome.isBlank()) {
            nome = sc.nextLine();
        }

            char[] letras = nome.toCharArray();

            String invertido = "";
            for (int i = letras.length - 1; i >= 0; i--) {
                invertido += letras[i];


            }
            System.out.println("invertido: " + invertido);

    }
}