public class Main {

    public static int[] duplicar_vetor(int[] vetor, int tamanho) {
        int[] novo_vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++)
            novo_vetor[i] = vetor[i];
        return novo_vetor;
    }

    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 8, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        
        Dados[] dados_combSort = new Dados[3];
        Dados[] dados_gnomeSort = new Dados[3];
        Dados[] dados_bucketSort = new Dados[3];
        Dados[] dados_bubbleSort = new Dados[3];
        Dados[] dados_selectionSort = new Dados[3];
        Dados[] dados_cocktailSort = new Dados[3];



        dados_combSort[0] = Algoritmos.combSort(20, duplicar_vetor(vetor1, 20));
        dados_combSort[1] = Algoritmos.combSort(20, duplicar_vetor(vetor2, 20));
        dados_combSort[2] = Algoritmos.combSort(20, duplicar_vetor(vetor3, 20));
        
        dados_gnomeSort[0] = Algoritmos.gnomeSort(20, duplicar_vetor(vetor1, 20));
        dados_gnomeSort[1] = Algoritmos.gnomeSort(20, duplicar_vetor(vetor2, 20));
        dados_gnomeSort[2] = Algoritmos.gnomeSort(20, duplicar_vetor(vetor3, 20));
        
        dados_bucketSort[0] = Algoritmos.bucketSort(20, duplicar_vetor(vetor1, 20), 8, 31);
        dados_bucketSort[1] = Algoritmos.bucketSort(20, duplicar_vetor(vetor2, 20), 5, 32);
        dados_bucketSort[2] = Algoritmos.bucketSort(20, duplicar_vetor(vetor3, 20), 6, 99);

        dados_bubbleSort[0] = Algoritmos.bubbleSortFlag(20, duplicar_vetor(vetor1, 20));
        dados_bubbleSort[1] = Algoritmos.bubbleSortFlag(20, duplicar_vetor(vetor2, 20));
        dados_bubbleSort[2] = Algoritmos.bubbleSortFlag(20, duplicar_vetor(vetor3, 20));

        dados_selectionSort[0] = Algoritmos.selectionSort(20, duplicar_vetor(vetor1, 20));
        dados_selectionSort[1] = Algoritmos.selectionSort(20, duplicar_vetor(vetor2, 20));
        dados_selectionSort[2] = Algoritmos.selectionSort(20, duplicar_vetor(vetor3, 20));

        dados_cocktailSort[0] = Algoritmos.cocktailSort(20, duplicar_vetor(vetor1, 20));
        dados_cocktailSort[1] = Algoritmos.cocktailSort(20, duplicar_vetor(vetor2, 20));
        dados_cocktailSort[2] = Algoritmos.cocktailSort(20, duplicar_vetor(vetor3, 20));



        String[] print_vetor = {"Vetor 1 - ", "Vetor 2 - ", "Vetor 3 - "};
        System.out.println("\n\nDados combSort:");
        for (int i = 0; i < 3; i++) {
            System.out.println(print_vetor[i] + dados_combSort[i].paraString());
        }

        System.out.println("\n\nDados gnomeSort:");
        for (int i = 0; i < 3; i++) {
            System.out.println(print_vetor[i] + dados_gnomeSort[i].paraString());
        }

        System.out.println("\n\nDados bucketSort:");
        for (int i = 0; i < 3; i++) {
            System.out.println(print_vetor[i] + dados_bucketSort[i].paraString());
        }

        System.out.println("\n\nDados bubbleSort:");
        for (int i = 0; i < 3; i++) {
            System.out.println(print_vetor[i] + dados_bubbleSort[i].paraString());
        }

        System.out.println("\n\nDados selectionSort:");
        for (int i = 0; i < 3; i++) {
            System.out.println(print_vetor[i] + dados_selectionSort[i].paraString());
        }

        System.out.println("\n\nDados cocktailSort:");
        for (int i = 0; i < 3; i++) {
            System.out.println(print_vetor[i] + dados_cocktailSort[i].paraString());
        }
    }
}
