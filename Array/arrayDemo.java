package Array;
public class arrayDemo{
    public static void printingArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] printArray(int arr[]){
        int n = arr.length;
        int oddCount=0;
        for(int i=0 ;i<n; i++){
            if(arr[i] % 2 != 0){
                oddCount++;   
            }
        }
        int res[] = new int[oddCount];
        int idx=0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i] % 2 != 0){
                res[idx] = arr[i];
                idx++;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int arra[] = {1,2,3,4,5,6,7,8,9,10};
        printingArray(arra);
        int res[] = printArray(arra);
        printingArray(res);
    }
}
