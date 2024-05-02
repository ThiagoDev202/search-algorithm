import java.util.Arrays;

public class InsertionSort {
    
    public static void insertionSort(int[] array) {
        int n = array.length; // Tamanho do array
        for (int i = 1; i < n; ++i) {
            int key = array[i]; // Elemento atual
            int j = i - 1; // Inicializa a variável j para comparar com elementos anteriores        

            // Move os elementos do array[0..i-1], que são maiores que a chave,
            // para uma posição à frente de sua posição atual
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 20, 6, 14, 35, 50};
        System.out.println("Array antes da ordenação: " + Arrays.toString(arr));
        
        insertionSort(arr); 
        
        System.out.println("Array após a ordenação: " + Arrays.toString(arr));
    }
}


