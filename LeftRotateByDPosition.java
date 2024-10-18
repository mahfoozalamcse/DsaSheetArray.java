public class LeftRotateByDPosition {
    public static void printReverse(int arr[], int low, int high){
        
        while (low < high) {
      
          int temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;
          low++;
          high--;
        }
  
      }
    public static void rotateone(int arr[], int n){
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
      
    }
    public static void leftD(int arr[], int d, int n){
        for(int i=0; i<d; i++){
            rotateone(arr, n);
        }
    }

    // rotate optamize method
    public static void rotateD(int arr[], int d, int n){
        printReverse(arr, 0, d-1);
        printReverse(arr, d, n-1);
        printReverse(arr, 0, n-1);

    }
    public static void main(String[] args) {
        int arr[] = {12, 78, 90, 99, 13};
        int d = 2;
        int n = 5;
       // leftD(arr, 2, 5);

        rotateD(arr, 2, 5);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
