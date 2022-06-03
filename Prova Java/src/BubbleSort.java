import java.util.*;
import java.util.concurrent.TimeUnit;

public class BubbleSort {
    public static void main(String[] args) {

        long start = System.nanoTime();

        List<Integer> v = new ArrayList<>();
        int[] v2 = {10000};
        int[] v3 = {100000};
        int[] v4 = {1000000};
        int[] v5 = {5000000};
        int[] v6 = {10000000};

//******************************************************************************************************************************************//
        // Processo de Desordenação do Vetor
        long start2 = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            v.add(i);
            Collections.shuffle(v);
        }


        System.out.println("Vetores Desordenados: " + v); // Impressão dos números embaralhados

        long end2 = System.nanoTime();
        long resultado2 = end2 - start2;

        // 1 segundo é igual a 1_000_000_000
        double cpu_time_used2 = (double)(resultado2) / 1e+9;
        System.out.println("Quantidade de Itens: " + (v.toArray().length - 1) + " -----> Tempo de uso da CPU: " + cpu_time_used2 + " segundos\n");
        //System.out.println("O tamanho do vetor é: " + v.toArray().length); //Verificação do tamanho do vetor

        //System.out.println(v.get(2)); //Impressão da posíção do item no vetor
//**************************************************************************************************************//
        // Processo de Ordenação do Vetor
        long start3 = System.nanoTime();
        for(int i = 0; i < v.toArray().length - 1; i++) {
            // for utilizado para ordenar o vetor.
            for (int j = 0; j < v.toArray().length - 1 - i; j++) {
        /* Se o valor da posição atual do vetor for maior que o proximo valor,
          então troca os valores de lugar no vetor. */
                if (v.get(j) > v.get(j + 1)) {
                    int aux = v.get(j);
                    v.set(j, v.get(j + 1));
                    v.set(j + 1, aux);
                }
            }
        }
        System.out.println("Vetores Ordenados: " + v);
        long end3 = System.nanoTime();
        long resultado3 = end3 - start3;

        // 1 segundo é igual a 1_000_000_000
        double cpu_time_used3 = (double)(resultado3) / 1e+9;
        System.out.println("Quantidade de Itens: " + (v.toArray().length - 1) + " -----> Tempo de uso da CPU: " + cpu_time_used3 + " segundos\n");

//*************************************************************************************************************************************************//

        long end = System.nanoTime();
        long resultado = end - start;

        // 1 segundo é igual a 1_000_000_000
        double cpu_time_used = (double)(resultado) / 1e+9;

        System.out.println("Tempo total de uso da CPU: " + cpu_time_used + " segundos");

        }
    }

