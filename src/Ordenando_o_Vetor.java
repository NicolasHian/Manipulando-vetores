public class Ordenando_o_Vetor {
    public static void main(String[] args) {
        int[] vetorinteiros = new int[]{5,44 ,3,99,101,45};
        System.out.print("Vetor ordenado cresente");
        ordenacaocresente(vetorinteiros);
        System.out.print("Vetor ordenado Decresente\n");
        decrecente(vetorinteiros);



    }

    private static void ordenacaocresente(int[] vetorinteiros) {
        for (int i = 0; i < vetorinteiros.length; i++) {
            for (int j = i; j < vetorinteiros.length; j++) {
                if(vetorinteiros[i] > vetorinteiros[j]) {
                    int aux = vetorinteiros[i];
                    vetorinteiros[i] = vetorinteiros[j];
                    vetorinteiros[j] = aux;

                }
            }
        }
        exibervalor(vetorinteiros);
    }
    private static void decrecente(int[] vetorinteiros) {
        for (int i = 0; i < vetorinteiros.length; i++) {
            for (int j = i; j < vetorinteiros.length; j++) {
                if(vetorinteiros[i] < vetorinteiros[j]) {
                    int aux = vetorinteiros[i];
                    vetorinteiros[i] = vetorinteiros[j];
                    vetorinteiros[j] = aux;

                }
            }
        }
        exibervalor(vetorinteiros);
    }
    private static void exibervalor(int[] vetorinteiros) {

        for (int i = 0; i <vetorinteiros.length; i++) {
            System.out.println(vetorinteiros[i]);
        }
    }
}

