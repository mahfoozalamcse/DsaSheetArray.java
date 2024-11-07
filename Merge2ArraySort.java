import java.util.Arrays;

public class Merge2ArraySort {
    public static void merge2array(int arr1[], int arr2[]){
        int n = arr1.length + arr2.length;
        int arr3[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] =arr2[i];
        }

        Arrays.sort(arr3);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {12, 89, 2, 67, 9};
        int arr2[] = {12, 9, 7, 1, 4};

        merge2array(arr1, arr2);
        
    }
}