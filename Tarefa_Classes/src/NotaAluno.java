

/**
 *
 * @author rafael.andrade
 * @version version1
 *
 */

public class NotaAluno {
    public static void main(String args[]) {


    /**
    * Método para atribuir as informações ao aluno
    */
    Aluno aluno = new Aluno();
    aluno.setNota(7);
    aluno.setMateria("Inglês");
    aluno.setNome("Rafael");


    /**
    * Método para imprimir as informações
    */
    System.out.println("Nome: " + aluno.getNome());
    System.out.println("Matéria: " + aluno.getMateria());
    System.out.println("Nota: " + aluno.getNota());



    }
}
