import java.util.Arrays;

public class MergeSort {
    
    // Método para ordenar um array usando o algoritmo Merge Sort
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        
        // Divide o array em duas metades
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        
        // Recursivamente ordena as duas metades
        mergeSort(left);
        mergeSort(right);
        
        // Combina as duas metades ordenadas
        merge(left, right, array);
    }
    
    // Método auxiliar para combinar duas metades ordenadas em um array ordenado
    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        
        // Combina os elementos das duas metades em ordem crescente
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        // Adiciona os elementos restantes de left (se houver)
        while (i < left.length) {
            result[k++] = left[i++];
        }
        
        // Adiciona os elementos restantes de right (se houver)
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 20, 6, 14, 35, 50};
        System.out.println("Array antes da ordenação: " + Arrays.toString(arr));
        
        mergeSort(arr);
        
        System.out.println("Array após a ordenação: " + Arrays.toString(arr));
    }
}
