public class Sort extends Sortable {

    /**
     * O Bublle Sort data da década de 1950 e, apesar de ser antigo, é o método mais simples e mais conhecido. Porém, é também o menos eficiente (realiza muitos passos para completar a classificação). Nesse método, a chave de maior/menor valor é colocada no final/início do vetor a cada varredura efetuada.
     * @param lista - uma array de inteiros de qualquer tamanho.
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
}
