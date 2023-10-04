public class Programa {

    /**
     * @author rafael.andrade
     */

    public static void main(String[] args) {

     //instanciando pessoaFisica e setando as caracteristicas
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Rafael");
        pessoaFisica.setSobrenome("Andrade");
        pessoaFisica.setEndereco("Rua teste");
        pessoaFisica.setIdade(26d);
        pessoaFisica.setCpf(1234567d);
        pessoaFisica.setRg(11233d);
        System.out.println("****** PESSOA FISICA *******");
        imprimir(pessoaFisica);

        //instanciando pessoaJuridica e setando as caracteristicas
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("João");
        pessoaJuridica.setSobrenome("Silva");
        pessoaJuridica.setEndereco("Rua teste2");
        pessoaJuridica.setIdade(29d);
        pessoaJuridica.setCnpj(12345678000120d);
        pessoaJuridica.setNumeroInscricao(114445782d);
        System.out.println("****** PESSOA JURIDICA *******");
        imprimir(pessoaJuridica);
    }

    //criando o método imprimir para imprimir na tela
    private static void imprimir(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Idade: " + pessoa.getIdade());

        //utilizados os if's para impressão das caracteristicas diferentes
        if (pessoa instanceof PessoaFisica) {
            System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
            System.out.println("RG: " + ((PessoaFisica) pessoa).getRg());
        }
        if (pessoa instanceof  PessoaJuridica) {
            System.out.println("CPF: " + ((PessoaJuridica) pessoa).getCnpj());
            System.out.println("RG: " + ((PessoaJuridica) pessoa).getNumeroInscricao());
        }

    }
}
