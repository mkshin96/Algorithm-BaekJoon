import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[a];

        for(int i = 0; i < a; i++){
            c[i] = sc.nextInt();
        }

        for(int i = 0; i < a; i++){
            if(c[i] < b) System.out.print(c[i] + " ");
        }
    }


}
