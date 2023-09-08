import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();
        notas.add(7);
        notas.add(10);
        notas.add(8);
        notas.add(6);
        System.out.println(notas);
        // Adicionar uma nota em uma posicao expecifica
        notas.add(1, 2);
        System.out.println(notas);
        // substituir a nota 8 por 10
        notas.set(notas.indexOf(8), 10);
        System.out.println("Nota 8 substituida por nota 10:\n"+notas);
        // Conferir se nota existe na lista
        System.out.println("Verificando se nota 10 existe na lista de notas:\n"+notas.contains(10));
        // Verificar se todos as notas foram inseridas e manipuladas na ordem
        System.out.println("notas:\n"+notas.toString());
    }
}
