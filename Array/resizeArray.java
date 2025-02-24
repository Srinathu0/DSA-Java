/* */
package Array;
public class resizeArray {
    public static void printArray(int arr[]){
        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] resizeArr(int arr[], int capacity){
        int temp[] = new int[capacity];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        //arr = temp;
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        printArray(arr);
        arr = resizeArr(arr, 10);
        printArray(arr);
    }
}
