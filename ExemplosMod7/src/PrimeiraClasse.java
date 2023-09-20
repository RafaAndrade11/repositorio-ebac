public class PrimeiraClasse {

    public static void main (String arg[]) {
     System.out.println("Olá Rafael");
     Cliente cliente = new Cliente();
     cliente.cadastrarEndereco("Rua 1");
     cliente.setCodigo(1);
     cliente.setNome("João");
     System.out.println(cliente.getCodigo());
     System.out.println(cliente.getNome());
     cliente.imprimirEndereco();

    }
}

