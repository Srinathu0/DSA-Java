import java.util.*;
public class sumOfN{
    // public static int findSum(int n){  
    //     return n*(n+1)/2;
    // }
    public static int findSum(int n){
        int sum = 0;
        for(int i=1 ;i<=n ;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double now = System.currentTimeMillis();
        sumOfN demo = new sumOfN();
        System.out.println(demo.findSum(99999));
        System.out.println("Time taken - "+(System.currentTimeMillis() - now)+ " milliseconds");
    }
}