public class RemoveDuplicate {
    public static void removeDup(int arr[]){
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                i++;
                
            }
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {12, 12, 89, 90, 90, 93, 93, 93};
        removeDup(arr);
    }
}
