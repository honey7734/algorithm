import java.util.Scanner;

public class BOJ_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%s * %s = %s\n", dan, i, dan*i);
        }
    }
}