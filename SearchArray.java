public class SearchArray {

    public static void searchKey(int arr[], int key){
      for(int i=0; i<arr.length; i++){
        if(arr[i] == key){
            System.out.println("Key is found : " + arr[i]);
        }
      }
      System.out.println("key is not found");
    }

    public static void main(String[] args) {
        int arr[] = {12, 78, 80, 79};
        int key = 68;
        searchKey(arr, key);
    }
}