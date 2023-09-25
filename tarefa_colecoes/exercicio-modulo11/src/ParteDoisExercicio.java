import java.util.ArrayList;
import java.util.List;

public class ParteDoisExercicio {

    public static void main(String[] args) {
        //listando e cadastrando as pessoas com o sexo
        //anexando a classe Pessoa
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Marta", "Feminino"));
        pessoas.add(new Pessoa("Miguel", "Masculino"));
        pessoas.add(new Pessoa("Joana", "Feminino"));
        pessoas.add(new Pessoa("Rafael", "Masculino"));
        pessoas.add(new Pessoa("Marcia", "Feminino"));
        pessoas.add(new Pessoa("Marcio", "Masculino"));
        pessoas.add(new Pessoa("Julia", "Feminino"));
        pessoas.add(new Pessoa("Felipe", "Masculino"));

        //impressão no console separado por grupos
        System.out.println("----NOMES MASCULINOS----");
        nomesPorSexo(pessoas, "Masculino");

        System.out.println("----NOMES FEMININOS----");
        nomesPorSexo(pessoas, "Feminino");
    }

    //usando o método nomesPorSexo para pegar somente os nomes das pessoas
    private static void nomesPorSexo(List<Pessoa> pessoas, String sexo) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equals(sexo)) {
                System.out.println(pessoa.getNome());
            }
        }
    }

}