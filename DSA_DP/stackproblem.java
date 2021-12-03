package DSA_DP; 
import java.util.*;

public class stackproblem { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
         }
         System.out.println("ans =>");
         int low = 0 ;
         int mid = 0;
         int high = arr.length - 1;
         while(mid <= high){
             if(arr[mid] == 0){
                 int temp = arr[low];
                 arr[low] = arr[mid];
                 arr[mid] = temp;
                 low++;
                //  high++;
             }else if( arr[mid] == 1){
                 mid++;
             }else{
                 int temp = arr[mid];
                 arr[mid]= arr[high];
                 arr[high] = temp;
                 high--;
             }
         }for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]);
         }
         
    }
    // public static  void sortStack(int[] arr){
    //     int low = 0 ;
    //     int mid = 0;
    //     int high = arr.length - 1;
    //     while(mid >= high){
    //         if(arr[mid] == 0){
    //             int temp = arr[low];
    //             arr[low] = arr[mid];
    //             arr[mid] = temp;
    //             low++;
    //             high++;
    //         }else if( arr[mid] == 1){
    //             mid++;
    //         }else{
    //             int temp = arr[high];
    //             arr[high] = arr[mid];
    //             arr[mid] = temp;
    //         }
    //     }
    //     // return ms;
    // }
}
// 6
// 1
// 1
// 1
// 0
// 0
// 2
// ans =>
// 1
// 1
// 1
// 0
// 0
// 2