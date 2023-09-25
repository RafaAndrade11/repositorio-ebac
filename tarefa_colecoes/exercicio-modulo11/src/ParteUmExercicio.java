import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParteUmExercicio {

    public static void main(String[] args) {
        impressaoListNormal();
        impressaoOrdemAlfabetica();

    }
    private static void impressaoOrdemAlfabetica() {
        //ordenando em ordem alfabética
        System.out.println("-----ORDEM ALFABÉTICA-----");
        List<String> lista = new ArrayList<>();
        lista.add("Rafael");
        lista.add("Miguel");
        lista.add("Marcio");
        lista.add("Felipe");
        Collections.sort(lista);
        System.out.println(lista);

    }
    //impressão dos nomes utilizando o list
    private static void impressaoListNormal() {
        System.out.println("-----IMPRESSÃO NORMAL-----");
        List<String> lista = new ArrayList<>();
        lista.add("Rafael");
        lista.add("Miguel");
        lista.add("Marcio");
        lista.add("Felipe");
        System.out.println(lista);
    }

}
