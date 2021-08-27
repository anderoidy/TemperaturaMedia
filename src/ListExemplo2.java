import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExemplo2 {
    public static void main(String[] args) {

        //List<Double> listaDeNumeros = new LinkedList<>();
        List<Double> listaDeNumeros;

        listaDeNumeros = Arrays.asList(1.d, 5.d, 9.5, 10.6, 34.d);

        System.out.println(listaDeNumeros);
    }
}
