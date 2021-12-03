package DSA_DP;
import java.util.*;
// subString question not pindromicsubsequence
public class  palindromic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean[][] dp = new boolean[str.length()][str.length()];
        int coutn = 0;
        String ls  = "";
        for( int g = 0 ; g < str.length(); g++){
            int j = g;
            for( int i = 0; j < dp.length ; i++ , j++){
                if(g == 0){
                    dp[i][j] = true;
                    String ns = str.substring(i,j +1);
                    if(ls.length() < ns.length()){
                        ls = ns;
                    }
                     
                }else if(g == 1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = true;
                        String ns = str.substring(i,j +1);
                        if(ls.length() < ns.length()){
                            ls = ns;
                        }
                    }
                }else{
                    if(str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]){
                        dp[i][j] = true;
                        String ns = str.substring(i,j +1);
                        if(ls.length() < ns.length()){
                            ls = ns;
                        }
                    }
                }
                if(dp[i][j]){
                    coutn++;
                }
            }
        }
        System.out.println(coutn);
        System.out.println(ls);
    }
}
