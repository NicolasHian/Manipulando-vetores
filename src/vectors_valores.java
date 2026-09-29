import java.util.Scanner;

public class vectors_valores {
    public static void main(String[] args) {
        System.out.println("Digite o tamanho do vector:");
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        int vetoruser[]= new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor da posiçao " + i + " do seu vector:");
            vetoruser[i] = sc.nextInt();


        }
        System.out.println("veja os valores");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetoruser[i]);
        }

        System.out.println("Digite um valor que multiplicara cada  posiçao do vector:");
        int valoramultiplicar = sc.nextInt();

        System.out.println("veja os valores multiplicados");
        for (int i = 0; i < tamanho; i++) {
            vetoruser[i] = vetoruser[i] * valoramultiplicar;
        }
        exibervalor(vetoruser);
        sc.close();
    }
    private static void exibervalor(int[] vetoruser){
        System.out.println("veja os valores do vetor");
        for (int i = 0; i < vetoruser.length; i++) {
            System.out.println(vetoruser[i]);
        }
    }
}
