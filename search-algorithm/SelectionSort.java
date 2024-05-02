import java.util.Arrays;

public class SelectionSort {
    
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        // Percorre todo o array
        for (int i = 0; i < n - 1; i++) {
            // Encontra o índice do menor elemento não ordenado
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Troca o menor elemento encontrado com o primeiro elemento não ordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 20, 6, 14, 35, 50}; 
        System.out.println("Array antes da ordenação: " + Arrays.toString(arr));
        
        selectionSort(arr);
        
        System.out.println("Array após a ordenação: " + Arrays.toString(arr));
    }
}
