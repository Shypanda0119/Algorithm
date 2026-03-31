import java.io.*;
import java.util.*;

public class Main {
  static int cnt;
  public static int recursion(String str, int l, int r){
    cnt++;
    if(l >= r) return 1;
    else if(str.charAt(l) != str.charAt(r)) return 0;
    else return recursion(str, l+1, r-1);
  }

  public static int isPalindrome(String str){
    return recursion(str, 0, str.length()-1);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n =  Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<n; i++){
      String str = br.readLine();
      cnt = 0;

      int result = isPalindrome(str);
      sb.append(result).append(" ").append(cnt).append("\n");
    }
    System.out.println(sb);
  }
}