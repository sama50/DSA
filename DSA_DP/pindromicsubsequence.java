package DSA_DP;
import java.util.*;

public class pindromicsubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[][] dp = new int[str.length()][str.length()];
        for( int g = 0 ; g < str.length() ; g++){
            int j = g ;
            for( int i = 0 ; j < str.length() ; i++ , j++){
                if(g == 0){
                    dp[i][j] = 1;
                }else if( g == 1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = str.subSequence(i, j + 1).length() + 1;

                    }else{
                        dp[i][j] = str.subSequence(i, j + 1).length();
                    }
                }else{
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = dp[i][j - 1] + dp[i + 1][j] + 1;
                    }else{
                        dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];
                    }
                }
            }
        }
        System.out.println(dp[0][dp.length - 1]);
    }
}
