import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sumMoney = scanner.nextInt();
        int sumBuy = scanner.nextInt();
        int money, buy, sum = 0;
        for(int i=1; i<=sumBuy; i++){
            money = scanner.nextInt();
            buy = scanner.nextInt();
            sum += money * buy;
        }
        if(sum == sumMoney){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}