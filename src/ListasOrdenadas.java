import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListasOrdenadas {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>() {{
            add(new Gato("John", 18,"preto"));
            add(new Gato("Simba", 6,"tigrado"));
            add(new Gato("John", 12,"amarelo"));
        }};

        // Imprimir na ordem de insercao
        System.out.println(gatos);
        // imprimir na ordem aleatoria
        Collections.shuffle(gatos);
        System.out.println(gatos);
        // Ordem natural (Nome)
        // gatos.sort(); NAO PODEMOS USAR O SORT.
        // por que o sort recebe um valor do tipo Comparator e nossa lista de gatos é do tipo
        // Comparable, entao nos utilizamos o sort da classe Collections por que uma lista deve ser ordenada
        // tem que receber um Comparable, entao:
        Collections.sort(gatos);
        System.out.println(gatos);
        // Ordenar por idade
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println("Lista ordenada por idade dos gatos: \n"+gatos);
        // Ordenar por cor
        Collections.sort(gatos, new ComparatorCor());
        System.out.println("Ordenando gatos por cores: \n"+gatos);
        // Ordenar por nome/cor/idade
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) {
            return nome;
        }
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) {
            return cor;
        }
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        /*
        * Tipos de retorno
        * -0(zero) é por que os gatos tem nomes iguais
        *
        * - 1 significa que o gato que eu estou comparando é maior que o gato que estou comparando,
        * ou seja o gato que recebi de parametro
        *
        * - -1 significa que o gato que estou comparando é menor que o gato do parametro
        * */
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

