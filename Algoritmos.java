public class Algoritmos {
 
    public static Dados combSort(int tamanho, int[] vetor) {
        Dados dados = new Dados();
        boolean ordenado = false;
        int gap = tamanho;
        int comparar_indice, aux;

        while (!ordenado) {
            dados.iteracoes++;

            gap = (int) (gap / 1.3);
            if (gap <= 1) {
                gap = 1;
                ordenado = true;
            }

            for (int i = 0; i < (tamanho-gap); i++) {
                dados.iteracoes++;
                
                comparar_indice = gap + i;
                if (vetor[i] > vetor[comparar_indice]) {
                    aux = vetor[comparar_indice];
                    vetor[comparar_indice] = vetor[i];
                    vetor[i] = aux;
                    ordenado = false;

                    dados.trocas += 3;
                }
            }
        }
        return dados;
    }

    public static Dados gnomeSort(int tamanho, int[] vetor) {
        Dados dados = new Dados();

        int i = 0;
        while (i < tamanho) {
            dados.iteracoes++;

            if (i == 0 || vetor[i-1] <= vetor[i]) {
                i++;
            } else {
                int temp = vetor[i-1];
                vetor[i-1] = vetor[i];
                vetor[i] = temp;
                i--;

                dados.trocas += 3;
            }
        }
        return dados;
    }

    public static Dados bucketSort(int tamanho, int[] vetor, int valor_min, int valor_max) {
        Dados dados = new Dados();

        if (vetor == null) return null;
        if (valor_min == valor_max) return dados;

        int num_baldes = tamanho;

        int div = (valor_max - valor_min) / num_baldes;
        if (div == 0) div = 1;

        Node[] baldes = new Node[num_baldes];
        
        for (int i = 0; i < num_baldes; i++) {
            dados.iteracoes++;
            int indice_inserir = (vetor[i] - valor_min) / div;
            if (indice_inserir >= num_baldes)
                indice_inserir = num_baldes - 1;

            if (baldes[indice_inserir] == null) {
                dados.trocas++;
                baldes[indice_inserir] = new Node(vetor[i]);
            } else {
                dados.trocas += 2;
                Node novo_node = new Node(vetor[i]);
                novo_node.proximo = baldes[indice_inserir];
                baldes[indice_inserir] = novo_node;
            }
        }
        
        for (int i = 0; i < num_baldes; i++) {
            dados.iteracoes++;
            Node lista = baldes[i];
            if (lista == null) continue;
            while (lista.proximo != null) {
                dados.iteracoes++;
                Node menor = lista;
                Node atual = lista.proximo;
                while (atual != null) {
                    dados.iteracoes++;
                    if (atual.valor < menor.valor)
                        menor = atual;
                    atual = atual.proximo;
                }
                if (menor != lista) {
                    dados.trocas += 3;
                    int temp = lista.valor;
                    lista.valor = menor.valor;
                    menor.valor = temp;
                }
                lista = lista.proximo;
            }
        }
        

        int indice_inserir = 0;
        for (int i = 0; i < num_baldes; i++) {
            dados.iteracoes++;
            if (baldes[i] != null) {
                Node atual = baldes[i];
                while (atual != null) {
                    dados.trocas++;
                    dados.iteracoes++;
                    vetor[indice_inserir] = atual.valor;
                    indice_inserir++;
                    atual = atual.proximo;
                }
            }
        }
        return dados;
    }

    public static Dados bubbleSortFlag(int tamanho, int[] vetor) {
        Dados dados = new Dados();
        int temp;
        boolean trocou;
        for (int i = 0; i < tamanho; i++) {
            dados.iteracoes++;
            trocou = false;

            for (int j = 1; j < (tamanho-i); j++) {
                dados.iteracoes++;

                if (vetor[j-1] > vetor[j]) {
                    temp = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;
                    trocou = true;

                    dados.trocas += 3;
                }
            }
            if (!trocou) break;
        }
        return dados;
    }

    public static Dados selectionSort(int tamanho, int[] vetor) {
        Dados dados = new Dados();
        for (int i = 0; i < (tamanho-1); i++) {
            dados.iteracoes++;
            
            int minIndex = i;
            for (int j = (i+1); j < tamanho; j++) {
                dados.iteracoes++;

                if (vetor[j] < vetor[minIndex])
                    minIndex = j;
            }

            if (minIndex != i) {
                dados.trocas += 3;

                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
            }
        }
        return dados;
    }

    public static Dados cocktailSort(int tamanho, int[] vetor) {
        Dados dados = new Dados();
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;

        while (trocou) {
            dados.iteracoes++;
            trocou = false;

            for (int i = inicio; i < fim; i++) {
                dados.iteracoes++;

                if (vetor[i] > vetor[i+1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = temp;
                    trocou = true;

                    dados.trocas += 3;
                }
            }

            if (!trocou) break;

            trocou = false;
            fim--;

            for (int i = fim; i > inicio; i--) {
                dados.iteracoes++;

                if (vetor[i] < vetor[i-1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i-1];
                    vetor[i-1] = temp;
                    trocou = true;

                    dados.trocas += 3;
                }
            }
            inicio++;
        }

        return dados;
    }
}