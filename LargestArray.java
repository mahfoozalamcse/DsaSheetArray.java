public class LargestArray {
    public static int maxMinArray(int arr[]){
     //  int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            // if(min > arr[i]){
            //     min = arr[i];
            // }
        }
       // System.out.println("Min value : "+ min);
        return max;
    }

    // second max

    public static int secondMax(int arr[]){
        int max = 0;
        int res = -1;
        for(int i=1; i<arr.length; i++){
          if(arr[i] > arr[max]){
            res = max;
            max = i;
          }else if(arr[i] != arr[max]){
            if(res == -1 || arr[i] > arr[res]){
                res = i;
            }
          }
        }
          return res;
        
    }
    public static void main(String[] args) {
        int arr[] = {12, 13, 34, 98, 90};
        System.out.println(secondMax(arr));
        //System.out.println(maxMinArray(arr));

    }
}
