/* Find the missing number in an array
 * Given an array of n-1 distinct numbers in the range of 1 to n.
 * Find the missing numbers in it. [use n*(n+1)/2]
 * arr[1,2,3,5] (n-1)
 * 1 to n (1,2,3,"4",5) use formual 5(5+1)/2 = 15
 *  15 - 1+2+3+5 = 4
 */
package Array;
public class missingNum {
    public static int findMissing(int arr[]){
        int n = arr.length + 1;
        int res = (n*(n+1))/2; 
        // int sum=0;
        // for(int i=0; i<arr.length; i++){
        //     sum = sum + arr[i];
        // }
        // res -= sum;
        // return res;
        for(int num: arr){
            res = res - num;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,8,6,3,7};
        int result = findMissing(arr);
        System.out.print(result);
    }
}
