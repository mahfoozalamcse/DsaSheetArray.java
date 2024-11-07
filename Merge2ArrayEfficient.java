public class Merge2ArrayEfficient {
    public static void merge2arrayEffi(int arr1[], int arr2[]){
        
            int i = 0, j = 0;
            int n = arr1.length, m = arr2.length;
    
            while (i < n && j < m) {
                if (arr1[i] <= arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    i++;
                } else {
                    System.out.print(arr2[j] + " ");
                    j++;
                }
            
    
            // Print remaining elements of arr1, if any
            while (i < n) {
                System.out.print(arr1[i] + " ");
                i++;
            }
    
            // Print remaining elements of arr2, if any
            while (j < m) {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr1[] = {12, 89, 2, 67, 9};
        int arr2[] = {12, 9, 7, 1, 4};

        merge2arrayEffi(arr1, arr2);
    }
}
