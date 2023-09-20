import java.util.Scanner;

public class MediaResultado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    //leitura das notas
        System.out.println("Digite a primeira nota de 0 a 10: ");
        float nota1 =sc.nextFloat();

        System.out.println("Digite a segunda nota 0 a 10: ");
        float nota2 =sc.nextFloat();

        System.out.println("Digite a terceira nota 0 a 10: ");
        float nota3 =sc.nextFloat();

        System.out.println("Digite a quarta nota 0 a 10: ");
        float nota4 =sc.nextFloat();

        //calculando a media

        float media = (nota1 + nota2 + nota3 + nota4 )/ 4;

        System.out.println("A média é: " + media);

        //condições para mostrar o resultado

        if (media >= 7 && media <= 10) {
            System.out.println("APROVADO!!!");
        } else if (media >= 5 && media < 7) {
            System.out.println("RECUPERAÇÃO!!!");
        } else if (media < 5 && media > 0) {
            System.out.println("REPROVADO!!!");
        } else {
            System.out.println("MEDIA INVÁLIDA! REINICIE O PROGRAMA!");
        }


    }

}
