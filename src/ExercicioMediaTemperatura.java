import java.security.DomainLoadStoreParameter;
import java.util.*;

public class ExercicioMediaTemperatura {
    public static void main(String[] args) {

        Scanner pegandoDoUsuario = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<>();

        for (int i = 1; i< 6;i++){
            System.out.println("Entre com o valor do Mes %d " +i);
            double recebendoDoUsuario = pegandoDoUsuario.nextDouble();
            temperatura.add(recebendoDoUsuario);
        }

        //temperatura = Arrays.asList(35.8, 22.2, 4.7, 28.1, 21.3, 18.5);

        Iterator<Double> percorrePraSomar = temperatura.iterator();
        Double varControleSoma = 0d;
        while (percorrePraSomar.hasNext()) {
            Double proximoElemento = percorrePraSomar.next();
            varControleSoma += proximoElemento;
        }
        //Testando os valores maiores que a media
        double media = varControleSoma / temperatura.size();
        System.out.println("A soma das temperaturas = " + varControleSoma);
        System.out.println("A media das temperaturas = " + media);

        System.out.println(temperatura);
        System.out.println("Os maiores que a media ");
  /*      for (Double maiorQueAMedia: temperatura){
            if (maiorQueAMedia > media)
            System.out.println("Temperatura = " +maiorQueAMedia + " -- mes = " +temperatura.indexOf(maiorQueAMedia));
            //    System.out.println("mes = " +temperatura.indexOf(maiorQueAMedia));
            }*/

        for (Double maiorQueAMedia : temperatura) {
            if (maiorQueAMedia > media) {
                int indice = temperatura.indexOf(maiorQueAMedia);
                //System.out.println("Temperatura = " + maiorQueAMedia + " -- mes = " + (indice + 1));

                if (indice == 0) {
                    String mes = "janeiro";
                    System.out.println("Temperatura = " + maiorQueAMedia + " -- mes = " + (indice + 1) + " -- " + mes);
                }
                if (indice == 1) {
                    String mes = "Fevereiro";
                    System.out.println("Temperatura = " + maiorQueAMedia + " -- mes = " + (indice + 1) + " -- " + mes);
                }
                if (indice == 2) {
                    String mes = "Março";
                    System.out.println("Temperatura = " + maiorQueAMedia + " -- mes = " + (indice + 1) + " -- " + mes);
                }
                if (indice == 3) {
                    String mes = "Abril";
                    System.out.println("Temperatura = " + maiorQueAMedia + " -- mes = " + (indice + 1) + " -- " + mes);
                }
                if (indice == 4) {
                    String mes = "Maio";
                    System.out.println("Temperatura = " + maiorQueAMedia + " -- mes = " + (indice + 1) + " -- " + mes);
                }
                if (indice == 5) {
                    String mes = "Junho";
                    System.out.println("Temperatura = " + maiorQueAMedia + " -- mes = " + (indice + 1) + " -- " + mes);
                }
                if (indice == 6) {
                    String mes = "Julho";
                    System.out.println("Temperatura = " + maiorQueAMedia + " -- mes = " + (indice + 1) + " -- " + mes);
                }
            }
            //    System.out.println("mes = " +temperatura.indexOf(maiorQueAMedia));
        }
    }
}
