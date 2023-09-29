import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rafael.andrade
 */

//criação da função main e impressão do método imprimeGrupos
public class ExercicioModulo12 {
    public static void main(String[] args) {
        imprimeGrupos();
    }

    private static void imprimeGrupos() {
        //adicionando o scanner e separando os grupos
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        //criação do laço com while para ler o que foi solicitado e no final verificar
        //se o usuário deseja continuar
        while (true) {
            System.out.println("Digite o nome e o sexo separado por uma vírgula: ");
            String input = scanner.nextLine();

            String[] partes = input.split(",");
            //caso o usuário digite errado o programa reseta e avisa que errou
            if (partes.length !=2){
                System.out.println("UTILIZE O FORMATO SOLICITADO!");
                continue;
            }
            //guardando os nomes nos grupos correspondentes
            String nome = partes[0].trim();
            String sexo = partes[1].trim().toLowerCase();

            if (sexo.equalsIgnoreCase("masculino")) {
                grupoMasculino.add(nome);
            } else {
                grupoFeminino.add(nome);
            }
            System.out.println("DESEJA ADICIONAR OUTRA PESSOA? (S/N): ");
            String resp = scanner.nextLine();
            if (!resp.equalsIgnoreCase("s")) {
                break;
            }
        }
        //impressão no fim do laço while quando o usuário não quer cadastrar pessoas
        System.out.println("***** GRUPO MASCULINO *****");
        for (String pessoa: grupoMasculino) {
            System.out.println(pessoa);
        }
        System.out.println("***** GRUPO FEMININO *****");
        for (String pessoa: grupoFeminino) {
            System.out.println(pessoa);
        }
        scanner.close();
    }
}
