public class DeleteArray {
    public static int delete(int arr[], int key, int n){
        int i=0;
        for(i=0; i<n; i++){
            if(arr[i] == key){
               break;
            }
        }
        if(i == n){
            return n;
        }
        for(int j=i; j<n-1; j++){
                arr[j] = arr[j+1];
        }
        
        return n-1;
    }
    public static void printArr(int arr[], int length){
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12, 78, 90};
        int newSize = delete(arr, 78, 3);
        printArr(arr, newSize);
       
       
    }
}
