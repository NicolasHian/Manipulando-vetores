public class Vectors {
    public static void main(String[] args) {

        //declarar vector
        int vetor[] = new int[]{7, 55, 6, 99, 1};
        //mostra quantos numeros tem dentro do vetor ou casas
        System.out.println("numero de numeros dentro do vetor:" + vetor.length);
        //mostra os numeros de dentro do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("numero de dentro do vetor:" + vetor[i]);
        }

        // muda os valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            // multiplica so depois da segunda casa do vetor
            if (i > 2) {
                vetor[i] = vetor[i] * 10;
            }
            for (i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }


        }

    }}
