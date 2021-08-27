import java.util.*;
import java.util.Collections;

public class ListExemplo {
    public static void main(String[] args) {
        List<Double> listaDeNotas;

        //eSSA FORMA PODEMOS adiconar varios valores ao mesmo tempo em um Arraylist
        //Porem dessa forma nao posso adicionar nem remover usando o metodo .add
        listaDeNotas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6, 40d);

        //Outra forma é usando o List.of, porem tbm nao podemos nem adicionar usando o .dd nem remover usando o .remove

        System.out.println(listaDeNotas);

        for (Double percorrendoAlista: listaDeNotas) {
            System.out.println("--> " +percorrendoAlista);
        }

        System.out.println("O maior valor = " +Collections.max(listaDeNotas));
        System.out.println("O menor valor = " +Collections.min(listaDeNotas));

        //Exiba as soma das notas
        Iterator<Double> percorrendooPraSomar = listaDeNotas.iterator();
        Double varDeControleSoma = 0d;
        while (percorrendooPraSomar.hasNext()){
            Double proximoElemento = percorrendooPraSomar.next();
            varDeControleSoma += proximoElemento;
        }
        System.out.println("A soma do elementos do Array = " +varDeControleSoma);

        //Exiba a media das notas
        System.out.println("A media das notas = " +(varDeControleSoma/listaDeNotas.size()) );

        //System.out.println("A lista origial = " + listaDeNotas);

//        //Remova o indice 0
//        System.out.println("Remova do indice 0 ");
//        listaDeNotas.remove(0);
//        System.out.println("A lista com o indice 0 removido = " +listaDeNotas);

        //Remova o elemento 0d
//        listaDeNotas.remove(0d);
//        System.out.println("A lista com o elemeto 0d removido = " +listaDeNotas);


        //Exiba os elementos menores que 7
        System.out.println("Exiba os elementos menores que 7");
        listaDeNotas.removeIf(next -> next < 7);
        System.out.println(listaDeNotas);
    }
}
