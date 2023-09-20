public class Media {


    public static void main(String[] args) {
        calculoMedia();

    }
    //método quebrado fazendo os cálculos separados
    private static void calculoMedia() {
        int nota1 = 8;
        float nota2 = 7.4f;
        int nota3 = 6;
        float nota4 = 8.4f;
        float media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média do aluno é: " + media);

    }

}
