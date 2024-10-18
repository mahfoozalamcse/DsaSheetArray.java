public class LeftRotateByOne {
    public static void rotateOne(int arr[]){
           
       
        int start = 0;
        int end = arr.length-1;
        for(int i=1; i<arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            
            i++;
        }
        int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
      }
       
    
    public static void main(String[] args) {
       int arr[] = {12, 67, 89, 90, 80, 97};
       rotateOne(arr);
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      } 
      System.out.println();      
    }
}
