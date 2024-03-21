public class ArraySearch {

    static boolean isFound(int arr[], int index, int search){
        // Base Case (Array End)
        if(index == arr.length){
            return false;  // element not exist in an array
        }
        // Element exist in an array
        if(arr[index] == search){
            return true; // element exist
        }
        // Small Problem + Recursive Call
        return isFound(arr, index + 1, search);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int search = 150;
        int index = 0;
        System.out.println(isFound(arr, index, search)
        ?"Found":"Not Found");
    }
}
