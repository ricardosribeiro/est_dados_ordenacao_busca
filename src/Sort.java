public class Sort extends Sortable {

    /**
     * O Bublle Sort data da década de 1950 e, apesar de ser antigo, é o método mais simples e mais conhecido. Porém, é também o menos eficiente (realiza muitos passos para completar a classificação). Nesse método, a chave de maior/menor valor é colocada no final/início do vetor a cada varredura efetuada.
     *
     * @param lista uma array de inteiros de qualquer tamanho.
     */
    public static void bubbleSort(int[] lista) {
        int temp;
        entradas = lista.length;
        //Inicia  o Bubble sort
        for (int i = 0; i < lista.length; i++) {
            for (int j = 1; j < lista.length - i; j++) {
                count++;
                if (lista[j - 1] > lista[j]) { //item index[0] é maior que item index[1]?
                    temp = lista[j - 1];  //se sim, guarda item index[0] em uma variavel
                    lista[j - 1] = lista[j]; //lista index[0], recebe o valor do item index[1]
                    lista[j] = temp; //lista index[1] recebe valor que estava no index[0]
                }
            }
        }
    }


    /**
     * O segmento já ordenado é percorrido da direita para a esquerda, até que seja encontrada uma chave menor ou igual àquela que está sendo inserida, ou até que o segmento termine. Enquanto nenhuma das condições ocorrer, as chaves comparadas vão sendo deslocadas uma posição para a direita. Na hipótese da chave a ser inserida ser maior que todas as chaves do segmento ordenado, ela permanece em seu local original; caso contrário, é inserida na posição deixada vaga pelos deslocamentos, avançando-se, a seguir, a fronteira entre os dois segmentos. O processo todo é completado em n-1 iterações.
     *
     * @param lista uma array de inteiros de qualquer tamanho.
     */
    public static void insertionSort(int[] lista) {
        entradas = lista.length;
        int j, aux;
        for (int i = 1; i < lista.length; i++) {
            aux = lista[i];
            for (j = i - 1; j >= 0 && aux < lista[j]; j--) {
                lista[j + 1] = lista[j];
                count++;
            }
            lista[j + 1] = aux;
        }
    }
}
