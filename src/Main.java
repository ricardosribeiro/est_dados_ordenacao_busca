public class Main {

    public static void main(String[] args) {
        int[] lista = new int[80];
        sorteia(lista);
        Sort.bubbleSort(lista);
        exibe(lista);

        System.out.println("\nNumero de entradas: " + Sort.getEntradas());
        System.out.println("\nNumero de comparacoes: " + Sort.getCount());

    }

    public static void sorteia(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (32000 * Math.random());
            System.out.print(lista[i] + " ");
        }
    }

    public static void exibe(int[] lista) {
        System.out.println("\nVetor apos ordenacao");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }

}
