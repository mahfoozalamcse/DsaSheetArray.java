public class MoveZeroEnd {
    public static void move(int arr[], int n){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != 0){
               arr[count++] = arr[i];
               
            }
        }
        while (count < n) {
        arr[count++] = 0;
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 0, 89, 0, 90, 0, 87, 0};
        move(arr,8);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
