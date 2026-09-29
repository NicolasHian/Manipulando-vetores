public class ordenando_strings {
    public static void main(String[] args) {
        String[] vetorstring = new String[]{"computador","tela","brasil","alucard","naruto","iron man"};

        for (int i = 0; i < vetorstring.length; i++) {
            for (int j = i + 1; j < vetorstring.length; j++) {
                if (vetorstring[j].compareTo(vetorstring[i]) < 0) {
                    String aux = vetorstring[i];
                    vetorstring[i] = vetorstring[j];
                    vetorstring[j] = aux;
                }
            }

        }
        exibirValores(vetorstring);
    }

    private static void exibirValores(String[] vetorstring) {
        for (int i = 0; i < vetorstring.length; i++) {
            System.out.println(vetorstring[i]);
        }
    }
}