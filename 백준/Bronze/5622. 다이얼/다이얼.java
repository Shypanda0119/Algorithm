/*2 ABC
3 DEF
4/*
2 ABC
3 DEF
4 GHI
5 JKL
6 MNO
7 PQRS
8 TUV
9 WXYZ
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] inputArr = new int[input.length()];
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            inputArr[i] = input.charAt(i);
            if(inputArr[i] >= 'A' && inputArr[i] <= 'C') {
                sum += 3;
            }else if(inputArr[i] >= 'D' && inputArr[i] <= 'F') {
                sum += 4;
            }else if(inputArr[i] >= 'G' && inputArr[i] <= 'I') {
                sum += 5;
            }else if(inputArr[i] >= 'J' && inputArr[i] <= 'L') {
                sum += 6;
            }else if(inputArr[i] >= 'M' && inputArr[i] <= 'O') {
                sum += 7;
            }else if(inputArr[i] >= 'P' && inputArr[i] <= 'S') {
                sum += 8;
            }else if(inputArr[i] >= 'T' && inputArr[i] <= 'V') {
                sum += 9;
            }else if(inputArr[i] >= 'W' && inputArr[i] <= 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
