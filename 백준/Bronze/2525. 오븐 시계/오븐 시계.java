import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt(); 
        int D = C % 60;
        int E = B + D;
        C /= 60;
        if(E > 59){
            A++;
            E = (B + D) % 60;
        }
        if(A + C > 23){
            A -= 24;
        }
        System.out.printf("%d %d", A + C, E);
    }
}