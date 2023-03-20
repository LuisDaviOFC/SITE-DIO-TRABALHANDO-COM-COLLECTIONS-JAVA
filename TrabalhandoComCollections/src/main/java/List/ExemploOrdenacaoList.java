package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>(){{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 6, "tigrado"));
           add(new Gato("Jon", 12, "amarelo"));
        }};
        
        System.out.println("Ordem de Isenção");
        System.out.println(meusGatos);
        System.out.println("Ordem Aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem Natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem Idade");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("Ordem Cor");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);
    }
}
