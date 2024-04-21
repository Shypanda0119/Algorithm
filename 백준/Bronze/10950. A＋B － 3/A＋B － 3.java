import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int num1, num2;
        for(int i=0; i<test; i++){
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println(num1+num2);
        }
    }
}