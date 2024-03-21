public class AllOccur {
    static int [] findAllHelper(int arr[] , int index, 
    int search, int count){
        // Base Case
        if(index == arr.length){
            // create a new array to fill the result
            int result [] = new int[count];
            return result;
        }
        // Count all Occurance
        // index move from 0th index to end
        if(arr[index]==search){
            count++;
        }
        // Stack Building
        // Small Problem
        int result[] = findAllHelper(arr, index+1, search, count);
        if(arr[index]==search){
            result[count-1] = index;
        }
        return result;

    }
    static int[] findAll(int arr[], int index, int search){
       return  findAllHelper(arr, index, search, 0);
    }
    public static void main(String[] args) {
        int arr[] = {10,20, 50,100,50,90,50,200};
        int search = 50;
        int index = 0;
        int result[] = findAll(arr, index, search);
        for(int r : result){
            System.out.println(r);
        }
    }
}
