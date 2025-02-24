package Array;
public class reverseArray {
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverseArr(int num[], int start , int end){
        while(start<end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        return ;
    }
    public static void main(String args[]){
        int ar [] = {1,2,3,4,5,6,7,8,9,0};
        printArray(ar);
        reverseArr(ar, 0, ar.length-1);
        printArray(ar);
    }
}
