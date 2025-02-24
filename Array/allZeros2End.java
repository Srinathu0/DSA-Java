/* Given an array of integers, write a function to move all 0's to end of
 * it while maintaing the relative order of the non-zero elements.
 * Ex: {0,1,0,4,12} = {1,4,12,0,0}
 * Use 2 pointers (one for zero elements and another for non zero elements)
 * Here: j focuses on zero elements
 *       i focuses on non zero elements
*/
package Array;
public class allZeros2End {
    public static void printArray(int arr[]){
        for(int i=0 ;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void moveZeros(int arr[]){
        int j=0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        // int zero[] = {0,1,0,4,12};
        int zero[] = {8,1,0,2,1,0,3};
        printArray(zero);
        moveZeros(zero);
        printArray(zero);
    }
}
