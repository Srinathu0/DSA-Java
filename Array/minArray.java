package Array;
public class minArray {
    public static int findMin(int arr[]){
        int min = arr[0];
        for(int i=1 ; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int minArr[] = {5,4,10,9,1};
        int res = findMin(minArr);
        System.out.println(res);
    }
}
