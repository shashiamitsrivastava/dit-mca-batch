public class ArrayDemo {
    static void printArray(int arr[], int index){
        if(index == arr.length){
            return ;
        }
        System.out.println(arr[index]);
        printArray(arr, index+1);
    }
    public static void main(String[] args) {
        int age = 20; // contains value
       // int ages [] = new int[10]; // fill with 0
        // ages contains reference of an array
        //int []ages  = new int[10];
        int []ages = {10,20,30, 40 ,50};
        printArray(ages, 0);
        //int ages[] = {10,20,30, 40 ,50};
        //int [] ages = new int[]{10,20,30,40,50};


    }
}
