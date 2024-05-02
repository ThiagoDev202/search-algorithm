import java.util.Arrays;

public class BubbleSort {
    
    public static void bubbleSort(int[] array) {
        int n = array.length; // Tamanho do array
        
        for (int i = 0; i < n - 1; i++) {
            // Comparar elementos adjacentes
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 20, 6, 14, 35, 50};
        System.out.println("Array antes da ordenação: " + Arrays.toString(arr));
        
        bubbleSort(arr); 
        
        System.out.println("Array após a ordenação: " + Arrays.toString(arr));
    }
}


