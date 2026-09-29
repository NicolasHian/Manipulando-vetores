import java.util.Scanner;

public class vectorsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vector:");
        int tamanho = sc.nextInt();
     String[] vetordousuario = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor da posiçao " + i + " do seu vector:");
            vetordousuario[i] = sc.nextLine();

        }

        System.out.println("Digite a palavra a ser acresentada ");
        String palavraaseracresentada = sc.nextLine();

        System.out.println("veja os valores multiplicados");
        for (int i = 0; i < tamanho; i++) {
            vetordousuario[i] = vetordousuario[i].concat(palavraaseracresentada).toUpperCase();
        }
        exibervalor(vetordousuario);
        sc.close();
    }

    private static void exibervalor(String[] vetordousuario) {
        System.out.println("veja o vetor");
        for (int i = 0; i < vetordousuario.length; i++) {
            System.out.println(vetordousuario[i]);
        }
    }
}
