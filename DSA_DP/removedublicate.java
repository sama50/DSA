package DSA_DP;
import java.util.*;

public class removedublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for( int i = 0 ; i < n - 1; i++){
            if(arr[i] != arr[i + 1]){
                System.out.println(" =>"+arr[i]);
            }
        }
      
        
    }
}
// 1
// 1
// 2
// 2  
// [1, 2]
// ArrayList<Integer> sor = new ArrayList<>();
// HashSet<Integer> map = new HashSet<>();
// for( int i = 0 ; i < n ; i++){
//     if(map.contains(arr[i])){

//     }else{
//         sor.add(arr[i]);
//     }
//     map.add(arr[i]);
// }