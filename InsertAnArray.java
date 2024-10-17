public class InsertAnArray {
    // insert at the end
    // insert at the given index
    public static int inserEndArray(int arr[], int key, int n, int cap){
        if(n == cap){
            return n;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[arr.length-1]){
                arr[arr.length-1] = key;
            }
        }
        return n+1;
    }

    public static int inserPosArray(int arr[], int key, int n, int pos, int cap){
        if(n == cap){
            return n;
        }
        int idx = pos;
        for(int i=n-1; i>=idx; i--){
            arr[i+1] = arr[i];
        }
         arr[idx] = key;
         return n+1;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
    
    public static void main(String[] args) {
        int arr[] = new int[6];

        arr[0] = 13; arr[1] = 12; arr[2] = 12 ;

        printArr(arr);
        inserEndArray(arr, 13, 3, 6);
        printArr(arr);
        
        // printArr(arr);
        // inserPosArray(arr, 13, 3, 2, 6);
        // printArr(arr);

    }
}
