import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int max = 0;
        int same = 0;
        if (A != B && B != C && A != C){
            if(A > B){
                if(A > C){
                    max = A;
                }else{
                    max = C;
                }
            }else{
                if(B > C){
                    max = B;
                }else{
                    max = C;
                }
            }
            System.out.println(max*100);
        }else{
            if(A == B && B == C){
                same = A;
                System.out.println(10000+same*1000);
            }else{
                if(A == B || B == C){
                    same = B;
                }else{
                    same = A;
                }
                System.out.println(1000+same*100);
            }
        }
    }
}