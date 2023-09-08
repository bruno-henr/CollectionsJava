import java.util.*;

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
        // Buscar nota de acordo com sua posicao
        System.out.println(notas.get(2));
        // Exibir menor nota da lista
        System.out.println("Menor nota: "+ Collections.min(notas));
        // Exibir maior nota da lista
        System.out.println("Maior nota da lista"+ Collections.max(notas));
        // Exibir a soma de todas as notas da lista
        Iterator<Integer> iterator = notas.iterator();
        Integer total = 0;
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            total += next;
        }
        System.out.println("A soma total dos numeros: "+ total);
        // Exibir a media das notas
        System.out.println("Média: "+ total/notas.size());
        // remover um numero
        notas.remove(0);
        System.out.println("Removido item do indice 0: "+notas);
        // Remover todos elementos que sejam menores ou iguais a 7
        Iterator<Integer> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Integer next = iterator1.next();
            if(next <= 7) {
                iterator1.remove();
            }
        }
        System.out.println("Removido todas as notas menores ou iguais a 7: "+notas);
        // Apagar toda a lista
        notas.clear();
        System.out.println("Lista limpa: "+notas);
        // Verificando se lista está vazia
        System.out.println("lista vazia? "+notas.isEmpty());
    }
}
