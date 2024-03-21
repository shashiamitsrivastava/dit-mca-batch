public class ArrayDemo2 {
    // Array is Sorted or Not?
    static boolean isSorted(int arr[], int index){
        // Base case
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]> arr[index + 1]){
            return false;
        }
        // Small Problem
        // result - true, false
        boolean result = isSorted(arr, index + 1);
        return result;
    }


    public static void main(String[] args) {
        // arr reference type
        int arr[] = {10,20,30,40,50};
        System.out.println(isSorted(arr, 0)?"Sorted":"Not Sorted");
        // int [] arr2 = {10,20,30};
        // int [] arr3 = new int[10];// all fill 0
        // int [] arr4 = new int[]{10,20,30};
    }
}
