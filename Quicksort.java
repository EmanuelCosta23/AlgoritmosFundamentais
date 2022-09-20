public class QuicksortCormen {
    
    public static void quicksort(int[] A){        
        quicksort(A, 0, A.length - 1);
    }
    
    private static void quicksort(int[] A, int inicio, int fim){        
        if(inicio < fim){
            int q = partition(A, inicio, fim);
            quicksort(A, inicio, q - 1);
            quicksort(A, q + 1, fim);            
        }
    }
    
    private static int partition(int[] A, int inicio, int fim){
        int pivo = A[fim];        
        int i = inicio - 1;
        for(int j = inicio; j <= fim - 1; j++){
            if(A[j] <= pivo){
                i = i + 1;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, fim);
        return i + 1;
    }
    
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
