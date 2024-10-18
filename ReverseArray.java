public class ReverseArray {

    public static void printReverse(int arr[]){
      int n = arr.length-1; 
      int start = 0;
      int end = n;
      while (start < end) {
    
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }

    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 9, 0, 8, 13};
        int n = 6;
        printReverse(arr);
        printArr(arr);
    
    }
}