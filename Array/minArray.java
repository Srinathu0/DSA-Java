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
        int minArr[] = {5,9,3,15,1};
        int res = findMin(minArr);
        System.out.println(res);
    }
}
